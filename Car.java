class CarData{
    String CAR_name;
    String CAR_model;
    String CAR_Color;
    int CAR_Price;

    CarData(String name,String model,String Color,int Price){
        CAR_name = name;
        CAR_model = model;
        CAR_Color = Color;
        CAR_Price =Price;
    }

    public void car_details(){
        System.out.println("Car Name: "+CAR_name);
        System.out.println("Car model: "+CAR_model);
        System.out.println("Car color: "+CAR_Color);
        System.out.println("Car price: "+CAR_Price);

    }

}

public class Car {
    public static void main(String[] args) {

        System.out.println("Object 1");
        CarData obj1 = new CarData("BMW","2018","black",2400000);
        obj1.car_details();

        System.out.println("Object 2");
        CarData obj2 = new CarData("Ferrari","2022"," ",2400000);
        obj2.car_details();
    }
}
