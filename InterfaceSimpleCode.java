interface Train{
    void Engine_Details();
}
class Engine implements Train{
    public void Engine_Details(){
        System.out.println("40 Cylinders 800 HP Engine");
    }
}
public class InterfaceSimpleCode {
    public static void main(String[] args) {
        Engine obj = new Engine();
        obj.Engine_Details();
    }
}
