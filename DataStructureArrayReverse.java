import java.util.Scanner;

public class DataStructureArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int reverseArr[] = new int[n];

        System.out.println("Enter the array elements ");
        for(int i = 0;i<n;i++){
            reverseArr[i] = sc.nextInt();
        }
        for(int i = (n-1);i>=0;i--){
            System.out.println(reverseArr[i]);
        }
    }
}
