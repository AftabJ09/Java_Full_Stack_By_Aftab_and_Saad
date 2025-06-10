import java.io.FileOutputStream;
public class Binary_File_Creation {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("song1.mp3")){
            System.out.println("Binnary file created sucessfully");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
