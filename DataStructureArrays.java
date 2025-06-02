public class DataStructureArrays {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        };
        if(array.length <3) System.out.println("The work is done");

        String name[] = {"A","f","t","a","b"};
        System.out.println("Before modification");
        for(int i=0;i<name.length;i++){
            System.out.println((i+1)+")"+" Character: "+name[i]);
            if(i == (name.length -  1)){
                name[i] = "B";
            }


        }
        System.out.println("After modification");
        for(int j=0;j<name.length;j++) {
            System.out.println((j + 1) + ")" + " Character: " + name[j]);
        }
    }
}
