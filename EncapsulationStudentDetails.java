class School_Student_Details{
    private String sname;
    private String sbranch;
    private String srollno;
    private String saddress;

    public String Getsname(){
        return sname;
    }
    public String Getbranch(){
        return sbranch;
    }
    public String Getsrollno(){
        return srollno;
    }
    public String Getsaddress(){
        return saddress;
    }

    public void SetDetail(String name,String branch,String address,String rollno){
        sname = name;
        sbranch = branch;
        srollno = rollno;
        saddress = address;
    }
}
public class EncapsulationStudentDetails {
    public static void main(String[] args) {
        School_Student_Details SSD = new School_Student_Details();
        SSD.SetDetail("Saad","AIML","RT Nagar","022");
        System.out.println("\nName: "+SSD.Getsname()+"\nRoll No: "+SSD.Getsrollno()+"\nBranch: "+SSD.Getbranch()+"\nAddress: "+SSD.Getsaddress());
        SSD.SetDetail("Ishtiaq","AIML","ShivajiNagar","036");
        System.out.println("\n\nName: "+SSD.Getsname()+"\nRoll No: "+SSD.Getsrollno()+"\nBranch: "+SSD.Getbranch()+"\nAddress: "+SSD.Getsaddress());

    }
}
