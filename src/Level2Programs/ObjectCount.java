package Level2Programs;

public class ObjectCount {
    private static  int count=0;


    //Constructor
    public ObjectCount(){
        count++;
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        ObjectCount Obj1 = new ObjectCount();
        ObjectCount Obj2 = new ObjectCount();
        ObjectCount Obj3 = new ObjectCount();

        System.out.println("Object Count "+ObjectCount.getCount());


    }
}
