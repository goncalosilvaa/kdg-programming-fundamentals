import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final long MINIMUM_DIVIDEND = 1_000_000_000_000L;
    final long MINIMUM_DIVISOR = 10_000_000L;
    long number1=0,  number2=0;
    boolean flag=true;

    do {
      System.out.print("Enter a 13-digit whole number: ");
      number1 = sc.nextLong();
      System.out.print("Enter a 8-digit whole number: ");
      number2 = sc.nextLong();

      if(number1<MINIMUM_DIVIDEND || number2<MINIMUM_DIVISOR) {
        flag=false;
        System.out.print("One of the entered numbers is too small.\n");
      } else {
        flag=true;
      }
    } while(!flag);

    System.out.print("The quotient is: "+number1/(double) number2); // We cast the divisor to "double"
    System.out.print("\nWithout the fractional part it's: "+ (long)(number1/(double) number2)); // We cast the whole expression to "long"
  }
}