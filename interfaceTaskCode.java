interface AnimalDogCat{
    void dog(String name,String breed,String color);
    void cat(String name,String color);
}
class animalCatDog implements AnimalDogCat{
    public void dog(String name,String breed,String color){
        System.out.println("Dog details --- \nDog Name: "+name+"\nDog breed: "+breed+"\nDog color: "+color);

    }
    public void cat(String name,String color){
        System.out.println("Cat details --- \nCat Name: "+name+"\nCat color: "+color);

    }
}
public class interfaceTaskCode {
    public static void main(String[] args) {
        AnimalDogCat ANIME = new animalCatDog();
        ANIME.dog("Clifford","Native","Red");
        ANIME.cat("Lucy","pink");

    }
}
