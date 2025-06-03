import java.util.Scanner;
public class ArrayWithInput {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size: ");
       int row = input.nextInt();
        System.out.println("Enter the column size: ");
       int  col = input.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        System.out.println("Enter the elements for first matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements for second matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j] = input.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(" "+(matrix1[i][j]+matrix2[i][j]));
            }
            System.out.println();
        }

    }
}
