import java.util.Scanner;
/* Following code is to understand the concept of nested if decision-making loop*/
public class Condition_Statements {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int number1 = input.nextInt();
    System.out.println("Enter second number: ");
    int number2 = input.nextInt();
    System.out.println("Enter third number: ");
    int number3 = input.nextInt();
    if(number1 > number2){

        if(number1 > number3){
            System.out.println(number1+ " is greater");
        }else{
            System.out.println(number3+ " is greater");
        }
    }else{
        if(number2 > number3){
            System.out.println(number2+" is greater");
        }else{
            System.out.println(number3+" is greater");
        }
    }
}

}
