class EMPLOYEE{
    String EMP_name;
    String EMP_role;
    String EMP_Salary;

    EMPLOYEE(String name,String role,String salary){
        EMP_name = name;
        EMP_role = role;
        EMP_Salary = salary;
    }
    public void employee_details(){
        System.out.println("Employee details are: ");
        System.out.println("Name: "+EMP_name+"\nRole: "+ EMP_role+ "\nSalary: "+EMP_Salary);
    }
}

public class Employee_Details {

    public static void main(String[] args) {
        String name = "Aftab J";
        String role = "Backend Developer";
        String Salary = "6,00,000";
        EMPLOYEE obj = new EMPLOYEE(name,role,Salary);
        obj.employee_details();

    }
}
