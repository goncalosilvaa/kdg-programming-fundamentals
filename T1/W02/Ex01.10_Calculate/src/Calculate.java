// Imports
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1=0, n2=0;
        char operation;

        n1=getValidNumber(sc, "Enter a number: ");
        n2=getValidNumber(sc, "Enter another number: ");

    }

    private static int getValidNumber(Scanner sc, String prompt) {
        bool checker=false;

        while(!checker) {
            System.out.print(prompt);

            if(!sc.hasNextDouble()) {
                System.out.println("You must enter a number.");
            }
        }
        return sc.nextDouble();
    }
}
