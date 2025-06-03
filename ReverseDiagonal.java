public class ReverseDiagonal {
    public static void main(String[] args) {

            int[][] matrix = {
                    {10,20,30},
                    {40,50,60},
                    {70,80,90}
            };
        System.out.println("Diagonal print");
        for(int k=0; k< matrix.length;k++){
            System.out.print(" " + matrix[k][k]);
        }
            System.out.println();
            System.out.println("Reverse Diagonal print");
            for(int k=0; k< matrix.length;k++){
                System.out.print(" " + matrix[k][matrix.length- k-1]);
            }
        }
    }

