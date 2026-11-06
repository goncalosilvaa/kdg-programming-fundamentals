// Imports
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final int MINIMUM=100000;
    final int MAXIMUM=999999;
    long number1=0, number2=0, product=0;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a 6-digit whole number: ");
    number1=sc.nextLong();
    System.out.print("Enter another 6-digit whole number: ");
    number2=sc.nextLong();

    if(number1>MAXIMUM || number2>MAXIMUM){
      System.out.println("One of the numbers is too large.");
    } else if(number1<MINIMUM || number2<MINIMUM){
      System.out.println("One of the numbers is too small.");
    } else {
      product=number1*number2;
      System.out.print("The product is: "+ product);
      System.out.print("\nThe 5 final digits are: "+product%MINIMUM);
    }
  }
}