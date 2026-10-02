// Imports
import java.util.Scanner;

// Class
public class Between {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Innitialize the scanner
        int n1=0, n2=0, n3=0, middleNumber=0; // Initialize and declaring variables

        // Gets the user input
        n1=getValidInput(sc, "Enter the first number (1...100): ", 1, 100);
        n2=getValidInput(sc, "Enter the second number (1...100): ", 1, 100);
        n3=getValidInput(sc, "Enter the third number (1...100): ", 1, 100);
        sc.close();

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

    private static int getValidInput(Scanner sc, String prompt, int min, int max) {
        int value=0;

        while(value<=0) {
            System.out.print(prompt);
             if(!sc.hasNextInt()) {
                System.out.println("Error: Please enter an integer!");
                sc.next(); // Clears invalid text
             } else {
                 int inputValue=sc.nextInt();
                 if(inputValue<min || inputValue>max) {
                     System.out.println("Error: Please enter a number between "+min+" and "+max+"!");
                 } else  {
                    value=inputValue;
                 }
             }
        }
        return value;
    }
}
