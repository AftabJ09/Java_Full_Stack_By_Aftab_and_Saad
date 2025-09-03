class WaterFill implements Runnable{
    public void run(){
        try {
            for (int i = 10; i <= 50; i += 10) {
                Thread.sleep(2000);
                System.out.println("Tank filled: " + i + "%");
            }
        }catch(Exception e){
            System.out.println("Problem in pipe or meter");
        }
    }
}
class MessageNotification extends Thread{
    public void run(){
        try{
            int count =0;
            while(count <=3){
                Thread.sleep(3000);
                System.out.println("Wating....");
                count += 1;
            }
            System.out.println("Tank filled");

        }
        catch(Exception e){
            System.out.println("Problem detected");
        }

    }
}
public class TankFillMultiThreading {
    public static void main(String[] args) {
        Runnable R1 = new WaterFill();
        Thread message = new MessageNotification();
        Thread fill = new Thread(R1);
        fill.start();
        message.start();

    }
}
