// Imports
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="";
        int bornYear=0;

        System.out.print("Please enter your name: ");
        name=sc.nextLine();
        System.out.printf("Dear %s, please enter the year you were born: ", name);
        bornYear=sc.nextInt();
        System.out.printf("If all goes well you'll be %d by the end of the year.", LocalDate.now().getYear()-bornYear);
    }
}