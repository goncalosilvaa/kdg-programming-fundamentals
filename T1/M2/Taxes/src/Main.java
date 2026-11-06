// Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double vat=0, amount=0;
        int op=0;

        do {
            System.out.print("Enter the VAT percentage: ");
            vat=sc.nextDouble();
            System.out.print("Enter an amount in €: ");
            amount=sc.nextDouble();
            System.out.print("Make a choice (1 = inclusive, 2 = exclusive): ");
            op=sc.nextInt();

            if(op<1 || op>2){
                System.out.println("Invalid choice!");
            }
        } while(op<1 || op>2);

        if(op==1){
            // inclusive
            System.out.printf("€%.1f + %.1f%% VAT = €%.1f\n",amount, vat, amount*(100/(100+vat)));
        } else if(op==2){
            // exclusive
            System.out.printf("€%.1f + %.1f%% VAT = €%.1f\n",amount, vat, amount*(1+vat/100));
        }
    }
}