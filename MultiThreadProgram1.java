
    class A21 extends  Thread{
        public void run(){
            for(int i =0;i<10;i++){
                System.out.println("Task"+(i+1)+"of"+"Class A running .....");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){
                    System.out.println("Exception detected");
                }
            }
        }
    }

     class B21 extends  Thread{
        public void run(){
            for(int i =0;i<10;i++){
                System.out.println("Task "+(i+1)+" of "+"Class B running .....");
            }
        }
    }
    public class MultiThreadProgram1 {
    public static void main(String[] args) {
        Thread obj1 = new A21();
        Thread obj2 = new B21();
        obj1.start();
        obj2.start();
    }
}
