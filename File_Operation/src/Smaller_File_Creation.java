import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Smaller_File_Creation {
    public static void main(String[] args) {
    String a = "java.txt";
    try{
        Files.write(Paths.get(a),"The file was edited".getBytes());
        System.out.println("File created successfully");
    }
    catch (Exception e){
            System.out.println(e);
        }
    }
}
