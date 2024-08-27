package Level3Programs;


import java.util.Scanner;

public class Claclualte {
    double Length,breadth,height;

    double input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        Length=sc.nextDouble();
        System.out.println("Enter breadth");
        breadth=sc.nextDouble();
        System.out.println("Enter Height");
        height=sc.nextDouble();

        return Length*breadth*height;
    }
    void volume(){
        double volume=input();
        System.out.println(volume);
    }

    public static void main(String[] args) {
        Claclualte c = new Claclualte();
        c.volume();
    }
}
