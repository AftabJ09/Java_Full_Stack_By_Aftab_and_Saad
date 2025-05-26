public class Jumping_Statements
{
    public static void main(String[] args) {
        int x = 1;
        while(x < 25){
            if(x == 2){
                System.out.print("Skip ");
                x++;
                continue;
            }
            System.out.print(x);
            System.out.print(" ");
            x++;
            if(x == 15){
                break;
            }
        }
    }
}
