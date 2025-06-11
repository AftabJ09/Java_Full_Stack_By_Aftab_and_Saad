import java.io.File;
import java.io.FileWriter;
public class DeleteFile {
    public static void main(String[] args) throws Exception{
        String file_path = "Data.txt";
        File file = new File(file_path);
        FileWriter writer = new FileWriter(file_path);
        writer.write("Hello");
        writer.close();
        String file_path1 = "user.txt";

        File file1 = new File(file_path1);
        FileWriter writer1 = new FileWriter(file_path1);
        writer1.write("Hello");
        writer1.close();

        if (file1.delete()){
            System.out.println("Deleted the file: "+file1.delete());

        }else{
            System.out.println("Failed to delete the file.");
        }
    }
}
