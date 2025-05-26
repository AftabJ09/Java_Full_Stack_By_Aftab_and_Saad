import java.util.Scanner;
class Student{
    private int id;
    public String name;
    void displayDetails(String name,int id){
        System.out.println("Th student details are");
        System.out.println("Name: "+name+"\nId: "+id);
    }
}
public class StudentTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        Student obj = new Student();
        obj.displayDetails(name,id);
    }
}
