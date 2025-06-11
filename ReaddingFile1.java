import java.io.FileReader;
public class ReaddingFile1 {
    public static void main(String[] args) throws Exception {
        String a = "java.txt";
        try(FileReader reader = new FileReader(a)){
            int character;
            while((character = reader.read()) != -1){
                System.out.println((char)character);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
