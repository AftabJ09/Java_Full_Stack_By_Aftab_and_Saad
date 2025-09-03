import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadingFile3 {
    public static void main(String[] args) {
        String inputPath = "pictures/car.jpg";
        String outputPath = "copied_image.jpg";

        try (FileInputStream reader = new FileInputStream(inputPath)) {
            // Step 1: Get file size
            int size = reader.available();  // total bytes in file

            // Step 2: Read all bytes into int[] (as you wanted)
            int[] data = new int[size];
            for (int i = size-1; i >=0; i--) {
                data[i] = reader.read();  // read each byte as int
            }

            // Step 3: Convert int[] to byte[]
            byte[] byteData = new byte[size];
            for (int i = 0; i < size ; i++) {
                byteData[i] = (byte) data[i];
            }

            // Step 4: Write to output file
            FileOutputStream writer = new FileOutputStream(outputPath);
            writer.write(byteData);
            writer.close();

            System.out.println("Image copied successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
