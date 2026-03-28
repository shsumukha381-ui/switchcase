import java.util.Scanner;






public class rightangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the a : ");
        double a;
        a = scanner.nextDouble();
        System.out.print("enter b : ");
        double b;
        b = scanner.nextDouble();
        scanner.nextLine();
        double c;
        c =Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));
        System.out.print(c);
        scanner.close();
    }
    
}
