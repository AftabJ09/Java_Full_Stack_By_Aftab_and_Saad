import java.sql.SQLOutput;

interface world{
    default void dem(){
        System.out.println("Earth");
    }

}

interface mars{
    default void dem(){
        System.out.println("Mars");
    }
}

class Venus{
    public void dem(){
        System.out.println("Venus");
    }
}
class Acess extends Venus implements mars{

}
public class Feature2 {
    public static void main(String[] args) {
        Acess ac = new Acess();
        ac.dem();
    }
}
