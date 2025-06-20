interface  GEM{
    default void demo(){
        System.out.println("You got a Gem!");
    }

}

class Gem implements GEM{

}
public class Feature1 {
    public static void main(String[] args) {
        Gem gem = new Gem();
    }
}