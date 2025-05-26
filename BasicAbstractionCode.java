abstract class Secrete{
    abstract void secrete_data();
}

class Access extends Secrete{
    void secrete_data(){
        System.out.println("Secrate data here: ");
        System.out.println("Abstraction is done");
    }
}
public class BasicAbstractionCode {
    public static void main(String[] args) {
        Access permit = new Access();

        permit.secrete_data();

    }
}
