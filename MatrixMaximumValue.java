import java.util.Scanner;
public class MatrixMaximumValue {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the matrix size: ");
        int size = SC.nextInt();
        int[][] Arr = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Arr[i][j] = (i*size+j+1);
            }
        }
        int max = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(Arr[i][j]+" ");
                if(max<Arr[i][j]){
                    max = Arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("The maximum element is: "+max);
    }
}
