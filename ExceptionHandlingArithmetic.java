public class ExceptionHandlingArithmetic {
    public static void main(String[] args) {
        int a = 365;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("There was some problem try again");
        }
    }
}
