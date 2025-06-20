interface  GEM{
    default void demo(){
        System.out.println("You got a Gem!");
    }

}

class Testing implements GEM{

}
public class Feature1 {
    public static void main(String[] args) {
        Testing gem = new Testing();
        gem.demo();

    }
}