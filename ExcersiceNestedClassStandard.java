class OldNested{
    class NewNested{
        public String display(){
            return "Austrian Painter";
        }
    }
}
public class ExcersiceNestedClassStandard {
    public static void main(String[] args) {
        OldNested ON = new OldNested();
        OldNested.NewNested NN = ON.new NewNested();
        System.out.println("The name is: "+NN.display());
    }
}
