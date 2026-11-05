import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        // Task 1:
            // Declaring and initalizing Random object
            Random random=new Random();

            // Printing 6 random numbers within the range [1, 6]
            for(int i=0;i<6;i++){
                System.out.printf("%d ", random.nextInt(1, 7));
            }

            // Printing 4 random booleans
            System.out.print("\n");
            for(int i=0;i<4;i++) {
                System.out.printf("%b ", random.nextBoolean());
            }

            // Printing 3 random decimals within the range [0, 1[
            System.out.print("\n");
            for(int i=0;i<3;i++) {
                System.out.printf("%f ", random.nextDouble(0, 1));
            }
        // Task 2:
            // Printing 10 random ints within the range [900, 1000]
            System.out.print("\n");
            for(int i=0;i<10;i++) {
                System.out.printf("%d ", random.nextInt(900, 1001));
            }

            // Printing 3 random decimals within the range [5, 10]
            System.out.print("\n");
            for(int i=0;i<10;i++) {
                System.out.printf("%f ", random.nextDouble(5, 11));
            }

            // Printing 10 random even numbers whthin the range [0, 100]
            System.out.print("\n");
            int evenCount=0;
            while(evenCount<10) {
                int evenNumber=random.nextInt(0,101);
                if(evenNumber%2==0) {
                    System.out.printf("%d ", evenNumber);
                    evenCount++;
                }
            }

            // Printing random multiples of 3 smaller than 100
            System.out.print("\n");
            int oddCount=0;
            while(oddCount<3) {
                int oddNumber=random.nextInt(101);
                if(oddNumber%3==0) {
                    System.out.printf("%d ", oddNumber);
                    oddCount++;
                }
            }

    }
}
