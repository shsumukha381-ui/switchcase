import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double abc = scanner.nextDouble();

        System.out.print("Enter the second number ");
        double bcd = scanner.nextDouble();
        System.out.println("1. Add");
        System.out.println("2. Subtrct");
        System.out.println("3.Multiplications");
        System.out.println("4.division");
        System.out.print("Enter the option you wanna to operations (1-4) :  ");
       
        int operations = scanner.nextInt();
        System.out.print("your option you chose is  : " + operations);
     



        scanner.close();
        if(operations == 1){
            double vd = abc + bcd;
            System.out.println("operations performed " + vd);
        }
        if(operations == 2){
            double df = abc-bcd;
            System.out.println("operations performed  :   " + df);
        }
        if(operations == 3){
            double fg = abc*bcd;
            System.out.println("operations performed :  "+ fg);
        if(operations == 4){
            double fh = abc/bcd;
            System.out.println("operations performed" + fh);
        }
        }
    }
}
