package Level3Programs;

import java.awt.*;
import java.util.Scanner;

interface shapes{

    double input();
    void area();

}

class Rectangle implements shapes{
    double length,breadth;
    @Override
    public double input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        length= sc.nextDouble();
        System.out.println("enter breadth");
        breadth= sc.nextDouble();
        return length*breadth;
    }
    @Override
    public void area(){
        double area = input();
        System.out.println(area);
    }

}
class Circle implements shapes{
    double radius;
    @Override
    public double input(){
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();
        return Math.PI*Math.pow(radius,2);
    }
    public void area(){
        double area=input();
        System.out.println(area);
    }
}

public class GetShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
    }
}
