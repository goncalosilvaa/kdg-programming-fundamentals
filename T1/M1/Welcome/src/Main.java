// Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstName;
        Scanner sc=new Scanner(System.in);

        System.out.print("What is your name? ");
        firstName=sc.nextLine();

        System.out.printf("Welcome %s!", firstName);
    }
}
