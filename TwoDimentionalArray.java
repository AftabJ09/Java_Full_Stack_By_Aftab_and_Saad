public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
}
