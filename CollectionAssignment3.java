import java.util.Vector;

public class CollectionAssignment3 {
    public static void main(String[] args) {
        Vector<String> clg = new Vector<>();
        clg.add("VVIT");
        System.out.println(clg);
        clg.add("Byrathi bande");
        System.out.println(clg);
        clg.add("CSE");
        System.out.println(clg);
        clg.set(2,"AIML");
        System.out.println(clg);
        clg.remove(2);
        System.out.println(clg);
        System.out.println(clg.contains("VVIT"));
        clg.clear();
        System.out.println(clg);
    }
}
