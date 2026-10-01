package calculate;

import java.util.Scanner;

public class Sum {
    void main() {
        int sum=0;
        int first=0;
        int second=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        first=sc.nextInt();
        System.out.println("Enter second number: ");
        second=sc.nextInt();

        sum=first+second;
        System.out.println("The sum is: "+sum);
    }
}
