class Vehicle{
    String color;
    String model;
    Vehicle(String color,String model){
        this.color = color;
        this.model = model;

    }
    protected void print_data1(){
        System.out.println("\nParent class data: \ncolor: "+color+"\nmodel: "+model);

    }
}


class Bmw extends Vehicle{
    String fuel_capacity;
    Bmw(String color,String model,String fuel_capacity){
        super(color,model);
        this.fuel_capacity = fuel_capacity;

    }
    void print_data2(){
        System.out.println("\nCHILD class data: \ncolor: "+color+"\nmodel: "+model+"\nfuel_capacity: "+fuel_capacity);
    }
}

public class SingleInheritanceAdvanceConcept {
    public static void main(String[] args) {
    Vehicle obj1 = new Vehicle("red","2021");
    obj1.print_data1();
    Bmw obj2 = new Bmw("black","2023","100 litres");
    obj2.print_data1();
    obj2.print_data2();


    }
}
