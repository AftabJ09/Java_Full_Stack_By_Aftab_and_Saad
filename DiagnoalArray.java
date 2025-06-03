public class DiagnoalArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++) {
                if (i == j) {
                    System.out.print(" " + matrix[i][j]);
                }
            }


        }
        System.out.println();
        System.out.println("Sir method down");
        for(int k=0; k< matrix.length;k++){
            System.out.print(" " + matrix[k][k]);
        }
    }
}
