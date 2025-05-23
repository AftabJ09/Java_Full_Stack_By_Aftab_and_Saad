class GrandFather{
    String height = "6 feet";
    public void Height(){
        System.out.println("\n1) GrandFather data: ");
        System.out.println("My height is: "+ height);
    }
}
class Father extends GrandFather{
    String height = "6 feet";
    String weight = "68 kg";
    public void Height(){
        System.out.println("\n2) Father data: ");
        System.out.println("My height is "+ height);
        System.out.println("My weight is "+ weight);
    }
}
class Son extends Father{
    String height = "6.1 feet";
    String weight = "70 kg";
    public void Height(){
        System.out.println("\n3) Son data: ");
        System.out.println("My height is "+ height);
        System.out.println("My weight is "+ weight);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        GrandFather grandfather = new GrandFather();
        Father father = new Father();
        Son son = new Son();
        grandfather.Height();
        father.Height();
        son.Height();

    }
}
