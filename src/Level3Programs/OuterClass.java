package Level3Programs;

public class OuterClass {
    static class inner{
        void show(){
            System.out.println("hellow");
        }
    }

    public static void main(String[] args) {
        OuterClass.inner obj1=new OuterClass.inner();
        obj1.show();
    }
}
