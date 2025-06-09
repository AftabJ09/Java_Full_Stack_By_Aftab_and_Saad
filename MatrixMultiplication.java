import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = input.nextInt();
        System.out.println("Enter the column size: ");
        int  col = input.nextInt();
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result = new int[row][col];

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
        System.out.println("Matrix Multiplication result: ");

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<col;k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        // Logic for the Matrix Multiplication
        

    }
}
