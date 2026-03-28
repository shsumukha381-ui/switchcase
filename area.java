import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the radius : ");
        double radius;
        radius = scanner.nextDouble();
        double area;
        area =  Math.PI*Math.pow(radius , 2);
        double volume;
        volume = 4/3*Math.PI*Math.pow(radius,3);
        System.out.println("the area is : "+ area);
        System.out.println("the volume is : "+ volume);

    }
}




    

