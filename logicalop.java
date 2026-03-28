public class logicalop {
    public static void main(String[] args){
        boolean isSunny = true;
        int temp = 12;
        
        if(temp<=30 && temp>=0 && !isSunny){
            System.out.println("good");
            System.out.println("its a sunny day 🌞🌞🌞;");
        }
        else if(temp<=15 || temp<=0){
            System.out.println("weather is bad");
        }

    }
}
