class ExcerciseOuter{
    private class ExcerciseInner{
        public String display(){
            return "Aftab J";
        }
    }

    String acess(){
        ExcerciseInner EI =  new ExcerciseInner();
        return EI.display();
    }

}
public class ExcersiceNestedClass {
    public static void main(String[] args) {
        ExcerciseOuter EO = new ExcerciseOuter();
        System.out.println("The name is: "+EO.acess() );

    }
}
