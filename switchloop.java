import java.util.Scanner;

public class switchloop {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        int grade=marks/10;

        switch (grade){
            case 1:System.out.println("grade is E");
            break;
            case 2:System.out.println("grade is E+");
                break;
            case 3:System.out.println("grade is D+");
                break;
            case 4:System.out.println("grade is D");
                break;
            case 5:System.out.println("grade is C");
                break;
            case 6:System.out.println("grade is C+");
                break;
            case 7:System.out.println("grade is B");
                break;
            case 8:System.out.println("grade is B+");
                break;
            case 9:System.out.println("grade is A");
                break;
            case 10:System.out.println("grade is A+");
                break;

            default:
                System.out.println("Invalid input");
                break;
        }


}
}
