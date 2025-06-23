interface Operation{
    int operator(int a,int b);
}
class DoesOperation implements Operation{
    public int add_operation(int a,int b){
        return a+b;
    }


}

public class Feature6 {
    public static void main(String[] args) {
        int value = 0;
        Operation obj = (int a,int b) -> System.out.println(value );


    }
}
