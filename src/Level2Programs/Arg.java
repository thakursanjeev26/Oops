package Level2Programs;

public class Arg {
    int num1;
    int num2;
    int num3;

    public Arg(int num1,int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
    }
    void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println(sum);
    }
    void add(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Arg a = new Arg(12,24,42);
        a.add(a.num1, a.num2);
        a.add(a.num1,a.num2, a.num3);
    }
}
