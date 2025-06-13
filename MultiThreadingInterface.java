class Front implements Runnable{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                Thread.sleep(1000);
                System.out.println("FrontEnd");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Back implements Runnable{
    public void run(){
            try{
                for(int i=0;i<10;i++){
                    Thread.sleep(2000);
                    System.out.println("BackEnd");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

public class MultiThreadingInterface {
    public static void main(String[] args) {

        Runnable front = new Front();
        Runnable back = new Back();
        Thread f1 = new Thread(front);
        Thread b1 = new Thread(back);
        f1.start();
        b1.start();
    }
}
