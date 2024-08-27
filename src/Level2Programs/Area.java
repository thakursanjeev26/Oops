package Level2Programs;

import java.util.Scanner;

class Rectangle{
    double length,breadth;

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    double calArea(){
       return length*breadth;
    }
}
class Triangle{
    double base,height;

    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    double calArea(){
        return (0.5*(base*height));
    }
}




public class Area {

    public static double calculateRectangleArea(Rectangle rec) {
        return rec.calArea();
    }

    // Method to calculate and return the area of the triangle
    public static double calculateTriangleArea(Triangle tri) {
        return tri.calArea();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Rectangle
        System.out.println("Enter Length and Breadth of Rectangle: ");
        Rectangle rec = new Rectangle(sc.nextDouble(), sc.nextDouble());

        // Input for Triangle
        System.out.println("Enter Base and Height of Triangle: ");
        Triangle tri = new Triangle(sc.nextDouble(), sc.nextDouble());

        // Calculate and get the area of Rectangle and Triangle
        double rectangleArea = calculateRectangleArea(rec);
        double triangleArea = calculateTriangleArea(tri);

        // Display the areas
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);


    }
}
