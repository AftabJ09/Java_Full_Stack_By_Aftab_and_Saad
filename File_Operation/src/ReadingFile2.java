import java.io.FileReader;
import java.io.FileInputStream;
public class ReadingFile2 {
    public static void main(String[] args) {
        String a = "java.txt";
        try(FileInputStream reader = new FileInputStream(a)){
            int character;
            while((character = reader.read()) != -1){
                System.out.println(character);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
