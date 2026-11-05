// Imports
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=0;
        boolean checker=true;

        // Controlling user input
        while(checker) {
            System.out.print("Enter your age:");

            if(sc.hasNextInt()) {
                age=sc.nextInt();
                checker=false;
            } else {
                System.out.println("Invalid input");
                sc.next();
            }
        }

        if(age>=18) {
            // Adult
            System.out.println("Adult 18+");
        } else if(age<=17 && age>=13) {
            // Teenager
            System.out.println("Teenager");
        } else if(age<=12 && age >=2) {
            // Child
            System.out.println("Child");
        } else {
            // Baby
            System.out.println("Baby");
        }
    }
}
