import java.util.Random;



public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads) {
            System.out.println("heads");
        }
        else {
            System.out.println("tails");
        }
    }
}
