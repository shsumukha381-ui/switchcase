import java.util.Scanner;


public class madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Adjective1;
        String noun1;
        String Adjective2;
        String verb1;
        String Adjective3;


        System.out.print("Enter an Adjective (description) ");
        Adjective1 = scanner.nextLine();
        System.out.print( "enter a noun(animal or person) ");
        noun1 = scanner.nextLine();
        System.out.print("Enter a adjective(Description) ");
        Adjective2 = scanner.nextLine();
        System.out.print("enter a verb that end with -ing(action) ");
        verb1 = scanner.nextLine();
        System.out.print("Enter a Adjective(Description)");
        Adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + Adjective1 + "Zoo");
        System.out.println("In an exhibit , I saw a" + noun1 + ".");
        System.out.println(noun1 + "was" + Adjective2 + "add" + verb1 + "!");
        System.out.println("I was" + Adjective3 + "!");
        scanner.close();


    }

}
