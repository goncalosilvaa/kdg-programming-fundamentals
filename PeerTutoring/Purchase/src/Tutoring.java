import java.util.Scanner;

public class Tutoring {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        float price, price2, price3;
        double price1Vat, price2Vat, price3Vat, total, appliedDiscount;

        System.out.print("Enter the price of the product 1: ");
        price=sc.nextFloat();
        if(price<0) {
            price=0;
            System.out.print("Invalid price, set to 0.\n");
        }
        price1Vat=price+(price*0.21);
        System.out.printf("Price incl. VAT: %.2f€\n", price1Vat);


        System.out.print("Enter the price of the product 2: ");
        price2=sc.nextFloat();
        if(price2<0) {
            price2=0;
            System.out.print("Invalid price, set to 0.\n");
        }
        price2Vat=price2+(price2*0.21);
        System.out.printf("Price incl. VAT: %.2f€\n", price2Vat);

        System.out.print("Enter the price of the product 3: ");
        price3=sc.nextFloat();
        if(price3<0) {
            price3=0;
            System.out.print("Invalid price, set to 0.\n");
        }
        price3Vat=price3+(price3*0.21);
        System.out.printf("Price incl. VAT: %.2f€\n", price3Vat);

        total=price1Vat+price2Vat+price3Vat; // Calculating total
        if(total==0) {
            System.out.print("No products purchased.\n");
        } else {
            System.out.printf("Total price is: %.2f€\n", total);
            if(total>100) {
                // Giving 10% discount if the total amount exceeds 100€.
                appliedDiscount=total*0.10;
                total-=appliedDiscount;
                System.out.printf("Discount applied: %.2f€\n", appliedDiscount);
                System.out.printf("Final price: %.2f€\n", total);
            }

            if(price>200) {
                System.out.print("You will receive an extra gift!\n");
            }
        }
    }
}
