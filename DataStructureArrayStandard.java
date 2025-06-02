import java.util.Scanner;
public class DataStructureArrayStandard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int Arr[] = new int[n];

        System.out.println("Enter the array elements ");
        for(int i = 0;i<n;i++){
            Arr[i] = sc.nextInt();
        }
        int max = Arr[0];
        for(int i = 1;i<n;i++){
            if(max < Arr[i]){
                max = Arr[i];
            }


        }
        System.out.println("Largest number in array: "+max);
    }
}
