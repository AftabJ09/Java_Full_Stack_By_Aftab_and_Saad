class CAR{
    String color;
    CAR(String color){
        this.color = color;

    }
    void print(){
        System.out.println("The car colour is: "+color);
    }

}

class BMw1 extends CAR{
    String price;

    BMw1(String color,String price){
        super(color);
        this.price = price;
    }
    void print_bmw(){
        print();
        System.out.println("The price is :"+price);
    }
}

class Audi extends CAR{
    String price;
    Audi(String color,String price){
        super(color);
        this.price = price;
    }
    void print_audi(){
        print();
        System.out.println("The price is :"+price);
    }
}
public class TaskHierarchical {
    public static void main(String[] args){
        CAR car = new CAR("grey");
    BMw1 bmw = new BMw1("red","1500000");
    Audi audi = new Audi("black","2500000");
    bmw.print_bmw();
    audi.print_audi();

    }
}
