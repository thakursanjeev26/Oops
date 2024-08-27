package Level3Programs;

abstract class Operations{
    abstract double add(double num1,double num2);
    abstract double subtract(double num1,double num2);
    abstract double multiply(double num1,double num2);
    abstract double divide(double num1,double num2);

}

 class SimpleCalculator {
    Operations op = new Operations() {
        @Override
        double add(double num1, double num2) {
            return (num1+num2);
        }

        @Override
        double subtract(double num1, double num2) {
            return (num1-num2);
        }

        @Override
        double multiply(double num1, double num2) {
            return (num1*num2);
        }

        @Override
        double divide(double num1, double num2) {
            return (num1/num2);
        }
    };
}

public class Calculator {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        double a=10;
        double b=20;

        System.out.println("Addition:"+calculator.op.add(a,b));
        System.out.println("Subtraction:"+calculator.op.subtract(a,b));
        System.out.println("Multiplication"+calculator.op.multiply(a,b));
        System.out.println("divide"+calculator.op.divide(a,b));
    }
}
