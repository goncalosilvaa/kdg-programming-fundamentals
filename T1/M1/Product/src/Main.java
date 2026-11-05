// Imports

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1=0, n2=0, n3=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        n1=sc.nextInt();
        System.out.print("Enter another number: ");
        n2=sc.nextInt();
        System.out.print("Enter a final number: ");
        n3=sc.nextInt();

        System.out.printf("The product is: %d", n1*n2*n3);
    }
}