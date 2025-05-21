import java.util.Scanner;
class Dog{
    String name = "Not Set";
    String breed = "Not Set";
    int age = 0;
    public void get_data(String name1, String breed1, int age1){
        this.name = name1;
        this.breed = breed1;
        this.age = age1;

    }
    public void print_data(){
        System.out.println("The data of the Dog is : ");
        System.out.printf(name+" "+breed+" "+age);
    }
}
public class MethodExample {
    public static void main(String[] args) {
        String dog_name = "";
        String dog_breed = "";
        int dog_age = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dog name,breed and age");
        dog_name = input.nextLine();
        dog_breed = input.nextLine();
        dog_age = input.nextInt();
        Dog obj = new Dog();
        obj.print_data();
        obj.get_data(dog_name,dog_breed,dog_age);
        obj.print_data();

    }
}
