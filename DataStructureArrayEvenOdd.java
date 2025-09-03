import java.util.Scanner;
public class DataStructureArrayEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int ARR[] = new int[size];
        System.out.println("Enter the array elements: ");
        int even=0,odd=0;
        for(int i=0;i<size;i++){
            ARR[i] = input.nextInt();

        }
        for(int i=0;i<size;i++){
           if(ARR[i] % 2 == 0){
               even += 1;
           }else{
               odd +=1;
           }

        }
        System.out.println("Even count: "+even+" Odd count: "+odd);
    }
}
