public class DataStructureArraysSum {
    public static void main(String[] args) {
        int sum = 0;
        int numbersArray [] ={10,20,30,40};
        for(int i = 0;i<numbersArray.length;i++){
            if(i == (numbersArray.length - 1)){
                sum = sum + numbersArray[i];
                System.out.println("SUM OF THE ARRAY IS: "+sum);
            }else{
                sum = sum + numbersArray[i];

            }

        }

    }
}
