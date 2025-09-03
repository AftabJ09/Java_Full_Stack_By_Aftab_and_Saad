import java.util.Scanner;
class Student_Data{

    void Student_detail(String name, String branch){
        System.out.println("1)Student Detail: ");
        System.out.println("Name: "+name);
        System.out.println("Branch: "+branch);
    }

    void Student_detail(String name,String branch,String address){
        System.out.println("\n2)Student Detail: ");
        System.out.println("Name: "+name);
        System.out.println("Branch: "+branch);
        System.out.println("Address: "+address);

    }
}
public class PolymorphismStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Branch: ");
        String branch = input.nextLine();
        System.out.println("Address: ");
        String address = input.nextLine();

        Student_Data SD = new Student_Data();
        SD.Student_detail(name,branch);
        SD.Student_detail(name,branch,address);
    }
}
