// Imports
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long min=1000, max=9999;
    long number=0, sum=0;
    int opFirstMenu=0, maxDigits=4;

    do {
      System.out.println("1.\tDefine a maximum number of digits");
      System.out.println("2.\tContinue with the default numbers of digits (4)");
      System.out.println("0.\tExit");
      System.out.print("Enter your choice: ");
      opFirstMenu=sc.nextInt();
    } while(opFirstMenu<0 || opFirstMenu>2);

    if(opFirstMenu==0) {
      System.exit(0);
    } else if(opFirstMenu==1) {
      System.out.print("Define a maximum number of digits: ");
      maxDigits=sc.nextInt();
      min=(long) Math.pow(10, maxDigits-1);
      max=(long) Math.pow(10, maxDigits)-1;
    }

    do {
      System.out.printf("Enter a %d-digit whole number: ", maxDigits);
      number = sc.nextLong();
    } while(number<min || number>max);

    for(int i=1;i<=maxDigits;i++) {
      sum+=(number%10);
      number/=10;
    }
    System.out.print("The sum of the digits of this number is: "+sum);
  }
}