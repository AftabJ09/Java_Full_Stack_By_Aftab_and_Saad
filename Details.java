class User{
    String user_name;
    int user_rollNo;
    User(String name ,int rollNo ){
        user_name = name;
        user_rollNo = rollNo;
        user_detail();

    }
    public void user_detail(){
        System.out.println("The details are: "+"Name: "+user_name+" ,Roll No: "+user_rollNo);
    }
}
public class Details {
    public static void main(String[] args) {
        User obj1 = new User("Aftab",001);


    }
}
