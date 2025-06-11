import java.lang.classfile.Superclass;
class King{
    String firstname;
    String surname;
    King(String firstname,String surname){
        this.surname =surname;
        this.firstname =firstname;
    }
    void King_data(){
        System.out.println("King: "+firstname+" "+surname);
    }
    String Heritage(){
        return firstname+" "+surname;
    }

}
class Prince1 extends King{
    int year;

    Prince1(String name,String surname,int year){
        super(name,surname);
        this.year = year;
    }
    void prince_1_detail(){
        String father = super.Heritage();
        System.out.println("Prince 1: "+firstname+" "+surname+" "+year);
        System.out.println("Prince "+firstname+" is son of "+father );
    }

}
class Prince2 extends  King{
    int wars;
    Prince2(String name,String surname,int wars){

        this.wars = wars;
        super(name,surname);

    }
    void prince_2_detail(){
        String father = super.Heritage();
        System.out.println("Prince 2: "+firstname+" "+surname+" "+wars);
        System.out.println("Prince "+firstname+" is son of "+father );
    }

}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        King king =new King("Shoib","Ali");
        Prince1 prince1 = new Prince1("Rehman","Ali",1984);
        Prince2 prince2 = new Prince2("Kareem","Ali",6);
        king.King_data();
        prince1.prince_1_detail();
        prince2.prince_2_detail();
        king.King_data();
    }
}
