import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day : ");
        String day = scanner.nextLine();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("its a weekday");
            case "saturday", "sunday" -> System.out.println("its weekend");
            default -> System.out.println(day + " is not a day");
        }
       scanner.close();
    }
}

