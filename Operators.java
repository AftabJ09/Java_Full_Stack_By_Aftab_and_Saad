import java.util.Scanner;
public class Operators {
    public static void main(String[] Args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A value: ");
            int a = sc.nextInt();
            System.out.println("Enter B value: ");
            int b = sc.nextInt();

            /* Relational operators */
            System.out.println("The answer is: "+(a>b));
            System.out.println("The answer is: "+(a<b));
            System.out.println("The answer is: "+(a>=b));
            System.out.println("The answer is: "+(a==b));
            System.out.println("The answer is: "+(a!=b));

            /*Logical Operators*/
            System.out.println("The AND Answer is: "+(a>b && b<=a));
            System.out.println("The OR Answer is: "+(a>b || b<=a));
            System.out.println("The NOT Answer is: "+(!(a>b && b<=a)));

            /*Bitwise operator */
            System.out.println("The BITWISE AND Answer is: "+(a&b));
            System.out.println("The BITWISE OR Answer is: "+(a|b));
            System.out.println("The BITWISE XOR Answer is: "+(a^b));
            System.out.println("The COMPLIMENT is: "+(~a));
            System.out.println("The LEFT SHIFT is: "+(a<<2));
            System.out.println("The RIGHT SHIFT is: "+(a>>2));

            /* Assignment Operators */
            System.out.println("The Add and assignment: "+(a += 1));
            System.out.println("The Minus and assignment: "+(a -= 1));
            System.out.println("The Multiply and assignment: "+( a *= 2));
        }
}


