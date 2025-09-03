import java.nio.file.Files;
import java.nio.file.Paths;
public class Type3FileCreation {
    public static void main(String[] args) throws  Exception {
        String a = "business-financial-data-march-2025-quarter-csv.csv";
        String content = "Time for lunch";
        Files.write(Paths.get(a),content.getBytes());
        System.out.println("Data inserted successfully");

    }
}
