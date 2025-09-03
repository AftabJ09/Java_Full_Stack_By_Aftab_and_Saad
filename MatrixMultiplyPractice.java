import java.util.Scanner;
public class MatrixMultiplyPractice {
    public static void main(String[] args) {
        int r1 = 0;
        int r2 = 0;
        int col1 = 0;
        int col2 = 0;

        int a[][] = new int[r1][col1];
        int b[][] = new int[r2][col2];
        int c[][] = new int[r1][col2];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row 1 size: ");
        r1 = sc.nextInt();
        System.out.print("Enter column 1 size: ");
        col1 = sc.nextInt();
        System.out.print("Enter row 2 size: ");
        r2 = sc.nextInt();
        System.out.print("Enter column 2 size: ");
        col2 = sc.nextInt();
        System.out.print("Enter elements of matrix 1 ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<col1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter elements of matrix 2 ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<col2;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int k = 0;k<r1;k++){
            for(int i=0;i<r1;i++){
                for(int j=0;j<col2;j++){
                    c[i][j] += a[i][j]*b[i][j];
                }
            }
        }
        System.out.print("Matrix multiplication: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
