import java.util.Scanner;
public class ExceptionArrayTopic {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the elements: ");
            for(int i= 0; i<5;i++){
                arr[i] = sc.nextInt();
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Only four inputs are allowed");
            for(int i= 0; i<4;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
