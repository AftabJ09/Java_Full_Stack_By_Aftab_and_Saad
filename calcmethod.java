class calci{
    public int add(int a,int b){
        return a+b;
    }
        public void sub(int a,int b){
        System.out.println("Subtraction: "+(a-b));
    }
        public void mult(int a,int b){
        System.out.println("mulitlication :"+(a*b));
    }
        public void div(int a,int b){
        System.out.println(("Division :"+a/b));
    }
        public void modulo(int a,int b){
        System.out.println("Modulo: "+(a%b));
    }
}
public class calcmethod {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        calci calculator=new calci();
        System.out.println("Adddition :"+calculator.add(a, b));
        calculator.sub(a, b);
        calculator.mult(a, b);
        calculator.div(a, b);
        calculator.modulo(a, b);
    }
}
