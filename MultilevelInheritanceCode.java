class Animal{
    String color;
    String type;
    Animal(String color,String type){
        this.color = color;
        this.type = type;
    }
    public void Details(){
        System.out.println("The following is the common data of a animal: ");
        System.out.println("The data of Animal: \nColour: "+color+"\nType: "+type);
    }
}

class Cat extends Animal{
    String name;
    Cat(String name,String color,String type){
        super(color,type);
        this.name = name;

    }
    public void Details(){
        System.out.println("Cat is a " +type+ " animal has following Info: ");
        System.out.println("The data of Animal: \nName: "+name+"\nColour: "+color+"\nType: "+type);
    }
}

class Kitten extends Cat{
    String gender;
    Kitten(String color,String type,String name,String gender){
        super(color,type,name);
        this.gender = gender;
    }
    public void Details(){
        System.out.println("This kitten is child of , Cat and is a " +type+ " animal has following Info: ");
        System.out.println("The data of Animal: \nName: "+name+"\nColour: "+color+"\nType: "+type+"\nGender: "+gender);
    }
}
public class MultilevelInheritanceCode {
    public static void main(String[] args) {
    Animal animal =  new Animal("White","Omnivorous");
    Cat cat = new Cat("Bruni","silver","Omnivorous");
    Kitten kitten = new Kitten("white","Omnivorous","Kruni","Female");
    animal.Details();
    cat.Details();
    kitten.Details();
    }
}
