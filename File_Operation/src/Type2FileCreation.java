import java.io.FileOutputStream;
public class Type2FileCreation {
    public static void main(String[] args) {
        String a = "business-financial-data-march-2025-quarter-csv.csv";
        String content = "Thank you for this data";
        try(FileOutputStream fos = new FileOutputStream(a)){
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("File created successfully");
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
