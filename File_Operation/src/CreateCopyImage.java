import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CreateCopyImage {
    public static void main(String[] args) {
        String inputPath ="pictures/car.jpg";
        String outputPath = "copy.jpg";

        try(
                FileInputStream fis = new FileInputStream(inputPath);
                FileOutputStream fos = new FileOutputStream(outputPath)){
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                System.out.println(bytesRead);
                fos.write(buffer,0,bytesRead);
            }
            System.out.println("Image copied successfully.");
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
