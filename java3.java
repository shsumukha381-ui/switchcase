import java.util.Scanner;

public class java3 {

    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age =  abc.nextInt();
        abc.nextLine();
        System.out.println("your" + " " +  age + "years old");
        System.out.print("Enter your Favorite color :   ");
        String color = abc.nextLine();
        System.out.println("your favorite color is :  " + color);
    }
}