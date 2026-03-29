import java.util.Scanner;


public class username {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your new username : ");
        String username = scanner.nextLine();
        if(username.contains("_") ||  username.contains(" ") ){
           System.out.print("username should not contain spaces or underscores");

        }
        else if(username.length() <4 || username.length()> 12){
            System.out.println("the length of username should be between 4 to 12 characters ");
        }
        else{
            System.out.println("Welcome" + " " + username);
        }
        scanner.close();
        
    }
}
