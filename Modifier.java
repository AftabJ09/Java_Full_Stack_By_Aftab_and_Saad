class PrivateModifier{
    private int num;
    public PrivateModifier(int num1){
        num = num1;
        print();
    }
    private void print(){
        System.out.println("The number is :"+num);

    }
}

public class Modifier {
    public static void main(String[] args) {
        PrivateModifier obj = new PrivateModifier(50);

    }
}
