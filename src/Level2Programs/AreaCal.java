package Level2Programs;

public class AreaCal {
    // Method to calculate the area of a square
    double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate the area of a circle
    double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCal areaCalc = new AreaCal();

        // Calculating the area of a square
        double squareArea = areaCalc.calculateArea(5.0);
        System.out.println("Area of the square: " + squareArea);

        // Calculating the area of a rectangle
        double rectangleArea = areaCalc.calculateArea(5.0, 10.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculating the area of a circle
        double circleArea = areaCalc.calculateArea(7.0, true);
        System.out.println("Area of the circle: " + circleArea);
    }
}



