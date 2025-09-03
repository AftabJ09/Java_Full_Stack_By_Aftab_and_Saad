abstract class Organization{
    abstract void Employee(String name,String Dep_Id);
    abstract void Department(String Dep_Id,String Role,String Team_Size);
    void greet(){
        System.out.println("Hello! Following are the details");
    }
}

class Record extends Organization{
    void Employee(String name,String Dep_Id){
        System.out.println("--- Employee record ---  ");
        System.out.println("Name: "+name);
        System.out.println("Dep_Id: "+Dep_Id);
    }

    void Department(String Dep_Id,String Role,String Team_Size){
        System.out.println("\n--- Department record ---  ");
        System.out.println("Dep_Id: "+Dep_Id);
        System.out.println("Role: "+Role);
        System.out.println("Team_size: : "+Team_Size);

    }
}
public class AbstractionTaskCode {
    public static void main(String[] args) {
        Record record = new Record();
        record.greet();
        record.Employee("Aftab J","DEP001");
        record.Department("DEP001","Developer","20");
    }
}
