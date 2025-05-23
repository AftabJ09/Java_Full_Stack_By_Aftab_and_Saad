class Dogs{
    String name;
    String Age;

    Dogs(String name,String Age){
        this.name = name;
        this.Age = Age;

    }
    void sound(){
        System.out.println(name+" is Barking");
    }

}
class baby_dog extends Dogs{
    String Color;
    baby_dog(String name,String Age, String color){
        super(name,Age);
        this.Color = color;

    }
    void display(){
        System.out.println("Dog Name: "+name);
        System.out.println("Breed: "+Age);
        System.out.println("Color"+Color);
        sound();
    }
}
public class TaskSingleInheritance {
    public static void main(String[] args) {
        baby_dog bd = new baby_dog("Bruno","2","Brown");
        bd.display();
    }
}
