class parent{
    public void A(){
        System.out.println("Feature 1");
    }
}
class child extends parent{
    public void A(){
        System.out.println("Feature 1 + Feature 2");
    }

    public void C(){
        System.out.println("Feature 3");
    }
}
public class SingleInheritance{
    public static void main(String[] args) {
        child obj = new child();
        obj.A();
        obj.C();
    }
}
