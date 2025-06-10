import java.io.File;
import java.io.FileWriter;
public class Type1FileCreation {
    public static void main(String[] args) throws Exception{
        String a = "java.txt";
        File file = new File(a);
        FileWriter writer = new FileWriter(file);
        writer.write("We have break at 11:30 Am");
        writer.write("We will update you with the next");
        System.out.println("Data insterted sucessfully");
        writer.close();
    }
}
