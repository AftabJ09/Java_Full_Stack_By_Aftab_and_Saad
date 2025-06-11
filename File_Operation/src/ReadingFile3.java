import java.io.FileInputStream;

public class ReadingFile3 {
    public static void main(String[] args) {
        String a = "pictures/car.jpg";
        try(FileInputStream reader = new FileInputStream(a)){
            int character;
            while((character = reader.read()) != -1){
                System.out.print(character+" ,");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
