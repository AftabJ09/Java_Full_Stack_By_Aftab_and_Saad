import java.io.File;
public class File_management_create {
    public static void main(String[] args) throws Exception{
       String File_name = "Data.txt";
       File file = new File(File_name);
       if(file.createNewFile()) {
           System.out.println("File created Sucessfully");
       }else{
           System.out.println("Failed to create the file");
       }
    }
}
