
import java.util.Scanner;


public class java4563 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        switch(day){
            case "monday" ,"tuesday" , "wednesday", "Thursday" , "Friday" -> System.out.print("its a weekday");
            case "saturday" , "sunday" -> System.out.println("its weekend");
            default -> System.out.println(day + "is not a day");
        

    }
    scanner.close();

   }
    
}
