// Imports
import java.util.Scanner;

// Class
public class Between {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Innitialize the scanner
        int n1=0, n2=0, n3=0, middleNumber=0; // Initialize and declaring variables

        System.out.print("Enter the first number (1...100): ");
        n1=sc.nextInt();
        System.out.print("Enter the second number (1...100): ");
        n2=sc.nextInt();
        System.out.print("Enter the third number (1...100): ");
        n3=sc.nextInt();

        // Defines the middle number
        if((n1>=n2 && n1<=n3) || (n3<=n1 && n1<=n2)){
            middleNumber=n1;
        } else if((n2>=n1 && n2<=n3) || (n1>=n2 && n2>=n3)){
            middleNumber=n2;
        } else {
            middleNumber=n3;
        }

        // Printing the middle number
        System.out.println("The middle number is: "+middleNumber);
    }
}
