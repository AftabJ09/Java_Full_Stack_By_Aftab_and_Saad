class EncapsulateUserDetail{
    private String username = "Aftab J";
    private int userAge = 23;
    public String getName(){
        return username;
    }
    public int getAge(){
        return  userAge;
    }

    public void SetName(String name){
        username = name;
    }
    public void SetAge(int age){
        userAge = age;
    }
}
public class EncapsulationSimpleCode {
    public static void main(String[] args) {
        EncapsulateUserDetail IN = new EncapsulateUserDetail();
        System.out.println("Name: "+IN.getName()+"\nAge: "+IN.getAge());
        IN.SetName("Saad");
        IN.SetAge(22);
        System.out.println("Name: "+IN.getName()+"\nAge: "+IN.getAge());
    }
}
