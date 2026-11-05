import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1=0, n2=0, n3=0, middleNumber=0;

    do {
      System.out.print("Enter the first number (1..100): ");
      n1=sc.nextInt();
    } while(n1<=0 || n1>100);

    do {
      System.out.print("Enter the second number (1..100): ");
      n2=sc.nextInt();
    } while(n2<=0 || n2>100);

    do {
      System.out.print("Enter the third number (1..100): ");
      n3=sc.nextInt();
    } while(n3<=0 || n3>100);

    // Defining middle number
    if(n1>n2 && n1<n3){
      middleNumber=n1;
    } else if(n2>n1 && n2<n3){
      middleNumber=n2;
    }  else if(n3>n1 && n3<n2){
      middleNumber=n3;
    }

    System.out.printf("The middle number is: %d", middleNumber);
  }
}