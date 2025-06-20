interface ABC21{
    void operation(int a,int b,String operator);
}

abstract class ASM implements ABC21{
    public void operation(int a,int b){
        System.out.println("The answer is: ");
    }
    public void addition(int a,int b){
        System.out.println(a+b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a-b);
    }


    public void multiplication(int a, int b) {
        System.out.println(a*b);
    }
}
abstract class Operationhelp extends ASM{

}

public class Feature5 {
    public static void main(String[] args) {
        /*
     ASM obj1 = new ASM();
     obj1.addition(2,3);
     obj1.subtraction(2,3);
     obj1.multiplication(2,3);
*/
     ABC21 obj2 = new ABC21() {
         @Override
         public void operation(int a, int b,String operator) {
             System.out.println("The answer is "+(a+b));
         }
     };
     obj2.operation(2,3,"+");

    }
}
