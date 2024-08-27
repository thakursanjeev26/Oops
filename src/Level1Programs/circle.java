package Level1Programs;

public class circle {
        int radius;

    public circle(int radius){
        this.radius=radius;
    }
    void area(){
        int area=(int)(Math.PI*Math.pow(radius,2));
        System.out.println("Area of Circle:"+area);
    }
    void circumference(){
        int circumference=(int)(2*(Math.PI*Math.pow(radius,2)));
        System.out.println("Circumference of circle:"+circumference);
    }

    public static void main(String[] args) {
        circle c = new circle(3);
        c.area();
        c.circumference();

    }
}
