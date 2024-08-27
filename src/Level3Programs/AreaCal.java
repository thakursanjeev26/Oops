package Level3Programs;
import java.util.Scanner;
public class AreaCal {


    double length,breadth;



    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        length=sc.nextDouble();
        System.out.println(" enter Breadth");
        breadth = sc.nextDouble();


    }

    void area(double length,double breadth){
        double area=length*breadth;
        System.out.println(area);
    }

    public static void main(String[] args) {
        AreaCal a = new AreaCal();
        a.input();
        a.area(a.length,a.breadth);
    }

}
