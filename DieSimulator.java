import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum= random.nextInt(6)+1;
        System.out.println("Your random number(1-6): "+randomNum);
    }
    
}
