package Level2Programs;
import java.util.Scanner;


public class Calculator {
    int num1,num2;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number 1:");
        num1=sc.nextInt();
        System.out.println("Enter The Number 2:");
        num2=sc.nextInt();
        int result=add(num1,num2);
        System.out.println("Addition of num1 and num2 is:"+result);
    }
    int add(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.input();
    }
}
