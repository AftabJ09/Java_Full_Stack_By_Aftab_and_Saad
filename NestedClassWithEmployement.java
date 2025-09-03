class EmployeeData1{

    public class Info{
        void EmployeInfo(){
            int Id = 001;
            System.out.println("The Employee Id is: "+Id);
        }
    }

    public void Informattion(){
        Info inf = new Info();
        inf.EmployeInfo();
    }

    public void Employee_detail_info(String name){
        System.out.println(name+" your Info");
    }
}
public class NestedClassWithEmployement {
    public static void main(String[] args) {

        EmployeeData1 emp1 = new EmployeeData1();
        emp1.Employee_detail_info("Aftab J");
        emp1.Informattion();


    }
}
