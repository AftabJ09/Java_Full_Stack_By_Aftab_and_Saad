abstract class Parent_Mobile{
    abstract void mobile();
    Parent_Mobile(){
        System.out.println("While studying in school, parent  mobile: Nokia ");
    }

}
class Child_Mobile extends Parent_Mobile{
    void mobile(){
        System.out.println("While studying in college, child mobile: VIVO Y17");
    }

        }
public class AbstractionTask2 {
    public static void main(String[] args) {
        System.out.println("Abstraction method overriding output: ");
        Parent_Mobile phone = new Child_Mobile();
        phone.mobile();


    }
}
