// Imports
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    final int MINIMUM=1000;
    final int MAXIMUM=9999;
    long number=0, minDynamic=0, maxDynamic=0, sum=0;
    int d1=0, d2=0, d3=0, d4=0;
    int opFirstMenu=0, maxDigits=0;

    do {
      System.out.println("1.\tDefine a maximum number of digits");
      System.out.println("2.\tContinue with the default numbers of digits (4)");
      System.out.println("0.\tExit");
      System.out.print("Enter your choice: ");
      opFirstMenu=sc.nextInt();

      if(opFirstMenu==0) {
        System.exit(0);
      } else if(opFirstMenu==1) {
        System.out.print("Define a maximum number of digits: ");
        maxDigits=sc.nextInt();
        final long MIN_DYNAMIC=(long) Math.pow(10, maxDigits-1);
        final long MAX_DYNAMIC=(long) Math.pow(10, maxDigits)-1;

        do {
          System.out.printf("Enter a %d-digit whole number: ", maxDigits);
          number = sc.nextLong();
        } while(number<MIN_DYNAMIC || number>MAX_DYNAMIC);

        for(int i=1;i<=maxDigits;i++) {
          sum+=(number%10);
          number/=10;
        }
        System.out.print("The sum of the digits of this number is: "+sum);
      } else if(opFirstMenu==2) {
        do {
          System.out.print("Enter a 4-digit whole number: ");
          number=sc.nextLong();
        } while(number<MINIMUM || number>MAXIMUM);

        d1=(int)(number/1000)%10;
        d2=(int)(number/100)%10;
        d3=(int)(number/10)%10;
        d4=(int)number%10;
        System.out.println("The sum of the numbers of this number is: "+(d1+d2+d3+d4));
      }
    } while(opFirstMenu<0 || opFirstMenu>2);
  }
}