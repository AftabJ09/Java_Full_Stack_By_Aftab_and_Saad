class Public{
    public void Display(){
        System.out.println("This is a public class");
    }

}
class PrivateModifier{
    public int num;
    public PrivateModifier(int num1){
        num = num1;
        print();
    }
    private void print(){
        System.out.println("The number is :"+num);

    }
}

class Protected{
    protected int details(){
        int a = 10;
        int b = 20;
        return a+b;
    }

}
public class Modifier {
    public static void main(String[] args) {
        Public obj1 = new Public();
        obj1.Display();
        PrivateModifier obj2 = new PrivateModifier(50);
        Protected obj3 =  new Protected();
        System.out.println(obj3.details());
    }
}
