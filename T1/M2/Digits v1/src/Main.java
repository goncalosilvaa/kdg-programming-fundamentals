// Imports
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d1=0, d2=0, d3=0, d4=0, number=0;

    do {
      System.out.print("Enter four digits (0..9).\n");
      System.out.print("The first digit: ");
      d1=sc.nextInt();
      System.out.print("The second digit: ");
      d2=sc.nextInt();
      System.out.print("The third digit: ");
      d3=sc.nextInt();
      System.out.print("The fourth digit: ");
      d4=sc.nextInt();
    } while((d1<0 || d2<0 || d3<0 || d4<0) || (d1>9 || d2>9 || d3>9 || d4>9));

    number=(d1*1000)+(d2*100)+(d3*10)+d4;
    System.out.printf("The number is: %d", number);
  }
}