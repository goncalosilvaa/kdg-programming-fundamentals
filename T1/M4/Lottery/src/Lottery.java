// Imports
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        // Declaring "random" object
        Random random = new Random(100);

        // Printing 7 random numbers [1,45]
        for(int i = 0; i<7; i++) {
            System.out.print(random.nextInt(1,46)+" ");
        }
    }
}
