import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year ");
        int year = input.nextInt();
        if((year%4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Year "+year+" is a leap year.");
        }else{
            System.out.println("Year "+year+" is not a leap year.");
        }
    }
}
