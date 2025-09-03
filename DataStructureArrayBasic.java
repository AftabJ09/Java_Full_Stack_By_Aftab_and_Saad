import java.util.Scanner;
public class DataStructureArrayBasic {
    public static void main(String[] args) {
       int Numbers[] = new int[5];
       Numbers[0] = 10;
       Numbers[1] = 20;
       Numbers[2] = 30;
       Numbers[3] = 40;
       Numbers[4] = 50;
        for(int i=0;i<Numbers.length;i++){
           System.out.println(Numbers[i]);
       }

        //with user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the elements");
        for(int i =0;i<Numbers.length;i++){
            Numbers[i] = sc.nextInt();
        }
        for(int i =0;i<Numbers.length;i++){
            System.out.println(Numbers[i]);
        }
        System.out.println(Numbers);


    }
}

