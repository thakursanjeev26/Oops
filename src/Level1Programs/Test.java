package Level1Programs;

abstract class Operations{
    abstract int add(int num1,int num2);
    abstract int sub(int num1,int num2);
    abstract int mul(int num1,int num2);
    abstract int div(int num1,int num2);

}

class Calculate{
    Operations op1= new Operations() {
        @Override
        int add(int num1, int num2) {
            return num1+num2;
        }

        @Override
        int sub(int num1, int num2) {
            return num1-num2;
        }

        @Override
        int mul(int num1, int num2) {
            return num1*num2;
        }

        @Override
        int div(int num1, int num2) {
            return num1/num2;
        }
    };
}

public class Test {

    public static void main(String[] args) {
        Calculate test = new Calculate();

        int a=10;
        int b=20;

        System.out.println(test.op1.add(a,b));
    }
}
