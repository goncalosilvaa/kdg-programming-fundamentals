// Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the 1st number: ");
        a=sc.nextInt();
        System.out.print("Type the 2nd number: ");
        b=sc.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, (a+b));
    }
}