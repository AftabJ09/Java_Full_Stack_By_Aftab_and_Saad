class Chatuser extends Thread{
    String user;
    String[] messages;
    Chatuser(String user,String[] messages){
        this.user = user;
        this.messages = messages;
    }

    public void run(){
        try{
            for(String message:messages){
                Thread.sleep(1000);
                System.out.println(user+": "+message);
            }
        }
        catch(Exception e){
            System.out.println("Network Issue");
        }
    }

}
public class ConversationMultiThreading {
    public static void main(String[] args) {
        String[] user1Messages ={"Hi","I am fine, what about you","when is the chess tournament"};
        String[] user2Messages =  {"Hello","How are you","I am doing good","It's next week on wednesday."};
        Thread user1 = new Chatuser("Saad",user1Messages);
        user1.start();
        Thread user2 = new Chatuser("Ishtiaq",user2Messages);
        user2.start();





    }
}
