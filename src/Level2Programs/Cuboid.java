package Level2Programs;

import java.util.Scanner;

public class Cuboid {
    double length,breadth,height;

    public Cuboid(double length,double breadth,double height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

   double perimeter(){
        double result=0;
        result=4*(length+breadth);
       System.out.println(result);
       return result;
   }
   double area(){
        double perimeterCal=perimeter();
        double result=0;
        result=length*breadth;
       System.out.println(result);
       return perimeterCal;
   }
   void volume(){
        double baseArea=area();
        double result=0;
        result=length*breadth*height;
       System.out.println(result);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length= sc.nextDouble();
        double breadth=sc.nextDouble();
        double height=sc.nextDouble();

        Cuboid c = new Cuboid(length,breadth,height);
        c.volume();
    }
}
