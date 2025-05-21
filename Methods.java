class abc
{
    public int sum1(int a,int b){
        return (a+b);
    }
    public void person(String name,int age){
        System.out.println("Hi "+name+" your age is "+age);
    }
}
public class Methods {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.person("Roy",20);
        System.out.println("The sum is: "+obj.sum1(5,10));

    }
}
