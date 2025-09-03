import java.util.Scanner;
public class PracticeTesting {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] Arr = new int [rows][columns];
        Scanner sc = new Scanner(System.in);
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                Arr[r][c] = sc.nextInt();
            }
        }


        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                System.out.print(Arr[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
