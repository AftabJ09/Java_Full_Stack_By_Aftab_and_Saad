class Addition{
    float add(int num1,int num2){
        return ((float)num1+num2);
    }
    float  add(int num1,int num2,int num3){
        return ((float) num1+num2+num3);
    }
}
public class Polymorphism1{
    public static void main(String[] args) {
        Addition A = new Addition();
        System.out.println("20+30 = "+A.add(20,30));

        System.out.println("20+30+40 = "+A.add(20,30,40));
    }
}
