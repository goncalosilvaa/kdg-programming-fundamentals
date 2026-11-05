// Imports
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double n1=0, n2=0;
    int op;

    // Asking for user input number 1
    System.out.print("Enter a number: ");
    n1=sc.nextInt();

    // Asking for user input number 2
    System.out.print("Enter another number: ");
    n2=sc.nextInt();

    // Asking for the operation
    do {
      System.out.print("Choose an operation:");
      System.out.print("\n1. Add");
      System.out.print("\n2. Subtract");
      System.out.print("\n3. Multiply");
      System.out.print("\n4. Divide");
      System.out.print("\n5. Exponentiation");
      System.out.print("\nOperation: ");
      op=sc.nextInt();
    } while(op<=0 || op>5);

    System.out.printf("\nYour choice: %d", op);

    if(op==1) {
      // Addition
      System.out.printf("\n%.0f + %.0f = %.0f",  n1, n2, n1+n2);
    } else if(op==2) {
      // Subtraction
      System.out.printf("\n%.0f - %.0f = %.0f",  n1, n2, n1-n2);
    } else if(op==3) {
      // Multiplication
      System.out.printf("\n%.0f * %.0f = %.0f",  n1, n2, n1*n2);
    } else if(op==4) {
      // Division
      System.out.printf("\n%.0f / %.0f = %.0f",  n1, n2, n1/n2);
    } else if(op==5) {
      // Exponentiation
      System.out.printf("\n%.0f ^ %.0f = %.0f",  n1, n2, Math.pow(n1, n2));
    }
  }
}