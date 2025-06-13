class Green extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(2000);
                System.out.print("\nGREED");

            }catch(Exception e){
                System.out.println("Red");
            }
        }
    }
}
class Yellow extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(3000);

                System.out.print("\nYELLOW");

            }catch(Exception e){
                System.out.println("Red");
            }
        }
    }
}
class Red extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(4000);
                System.out.print("\nRED");

            }catch(Exception e){
                System.out.println("Red");
            }
        }
    }
}
public class TracfficSignal {
    public static void main(String[] args) {
            Thread red = new Red();
            Thread yellow = new Yellow();
            Thread green = new Green();

            green.start();
            yellow.start();
            red.start();
    }
}
