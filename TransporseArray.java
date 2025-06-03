import java.util.Scanner;
public class TransporseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int row = input.nextInt();
        System.out.println("Enter the column size: ");
        int  col = input.nextInt();
        int[][] matrix = new int[row][col];
        int[][] traqnsporse_matrix = new int[row][col];
        System.out.println("Enter the elements for matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                traqnsporse_matrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print((traqnsporse_matrix[i][j])+" ");
            }
            System.out.println();
        }



    }
}
