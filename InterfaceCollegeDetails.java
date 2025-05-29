interface college{
    void PCMC(String name,String institute_name,String duration,float percentage);
    void AIML(String name,String institute_name,String duration,float percentage);
    void PHD(String name,String institute_name,String duration,float percentage);

}
class college1 implements college{
    public void PCMC(String name,String institute_name,String duration,float percentage){
        System.out.println("The details for PCMC Branch\n"+"Student Name: "+name+"\nCollege Name: "+institute_name+"\nCourse Duration: "+duration+"Scored percetage Result: "+percentage);
    }

    public void AIML(String name,String institute_name,String duration,float percentage){
        System.out.println("The details for PCMC Branch\n"+"Student Name: "+name+"\nCollege Name: "+institute_name+"\nCourse Duration: "+duration+"Scored percetage Result: "+percentage);
    }

    public void PHD (String name,String institute_name,String duration,float percentage){
        System.out.println("The details for PCMC Branch\n"+"Student Name: "+name+"\nCollege Name: "+institute_name+"\nCourse Duration: "+duration+"Scored percetage Result: "+percentage);
    }
}
public class InterfaceCollegeDetails {
    public static void main(String[] args) {
        /* method branch name, 3 methods, name ,college,number of years ,percentage(double or float) */
        college1 data = new college1();
        data.PCMC("Peter","New Horoizon","2",98.9F);
        data.AIML("Peter","Caramel College","4",95.26F);
        data.PHD("Peter","Harvard University","2",89.5F);
    }
}
