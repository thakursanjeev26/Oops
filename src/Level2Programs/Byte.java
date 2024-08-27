package Level2Programs;
import java.util.Scanner;
public class Byte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first bite Value");
        byte b1=sc.nextByte();
        System.out.println("Enter the second byte Value");
        byte b2= sc.nextByte();
        //type casted to float
        float sum=(float) b1+(float)b2;
        System.out.println(sum);
    }
}
