
import java.util.Scanner;



public class areaofrect {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("enter the lenght of rectangle :  ");
        double l = scanner.nextDouble();
        System.out.print("enter the breadth of the rectangle : ");
        double b = scanner.nextDouble();
        double t = 2*(l+b);
        double a = l*b;
        System.out.println("area = " + a + "m²");
        System.out.println("Perimeter = " + t + "m");
        scanner.close();
    }
       
    
}
