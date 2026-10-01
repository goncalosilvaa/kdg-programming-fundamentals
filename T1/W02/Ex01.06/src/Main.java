import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int currentYear=LocalDate.now().getYear();
        String firstName = null;
        int yearOfBirth=0;

        System.out.println("Enter your first name:");
        firstName=sc.nextLine();
        System.out.println("Dear "+firstName+", please enter the year you were born:");
        yearOfBirth=sc.nextInt();

        System.out.println("If all goes well you'll be "+(currentYear-yearOfBirth)+" by the end of the year.");
    }
}
