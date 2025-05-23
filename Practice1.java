class College{
    String name;
    String address;
    College(String name,String address){
        this.name = name;
        this.address = address;
    }
    void print(){
        System.out.println("Name and address: "+name+" "+address);
    }
}

class Department extends College{
String Dep_Name;
    String Teacher;
    Department(String name,String address,String Dep_Name,String Teacher){
        super(name,address);
        this.Dep_Name = Dep_Name;
        this.Teacher = Teacher;

    }
    void print(){
        System.out.println("Department and Teacher "+Dep_Name+" ,"+Teacher);
    }


}

class student_data extends College{
    String Student_name;
    String Teacher_name;
    String Roll_No;
    student_data(String Student_name,String Teacher,String Roll_No,String name,String address){
        super(name,address);
        this.Student_name = Student_name;
        this.Teacher_name = Teacher;
        this.Roll_No = Roll_No;
    }
    void display(){
        System.out.println("Student's Record");
        System.out.println("Student Name: " +Student_name);
        System.out.println("Roll No: " +Roll_No);
        System.out.println("Teacher Name: " +Teacher_name);
        System.out.println("College Name "+ name);
        System.out.println("College Address: " +address);

    }

}
public class Practice1 {
    public static void main(String[] args) {
        System.out.println("\n1)");
        College col = new College("HosTon","Bengaluru");
        col.print();
        System.out.println("\n2)");
        Department dep = new Department("HosTon","Bengaluru","CSE","Saad Khan");
        dep.print();
        System.out.println("\n3)");
        student_data stu = new student_data("Aftab J","Saad Khan","001","HosTon","Bengaluru");
        stu.display();

    }
}
