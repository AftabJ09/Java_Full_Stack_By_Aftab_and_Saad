class Outer1{
    private class Inner1{
        void person_detail(String name,int age){
            if (age < 18){
                System.out.println(name+" not eligible to drive");
            }else{
                System.out.println(name+" eligible to drive");
            }

        }

    }
    public void createInner(String name1,int  age1) {
        String name = name1;
        int age = age1;
        Inner1 obj = new Inner1();
        obj.person_detail(name,age);
    }

}
public class NestedClassStandardProgramme {
    public static void main(String[] args) {
        Outer1 obj1 = new Outer1();
        obj1.createInner("Aftab",22);
    }
}
