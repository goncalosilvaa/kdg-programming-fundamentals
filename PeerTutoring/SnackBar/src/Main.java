import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total=0, price=0, discount=0;
        int option, countItems=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("--- SNACK BAR ---");
        System.out.println("1. Popcorn      4,50");
        System.out.println("2. Soft drink   3,00");
        System.out.println("3. Nachos       5,50");
        System.out.println("0. Pay");

        do {
            System.out.print("Choice: ");
            option=sc.nextInt();

            String item = switch(option) {
                case 1 -> "Popcorn";
                case 2 -> "Soft drink";
                case 3 -> "Nachos";
                default -> "";
            };

            price=switch(option) {
                case 1 -> 4.50;
                case 2 -> 3.00;
                case 3 -> 5.50;
                case 0 -> {
                    System.out.println("Paying");
                    yield 0;
                }
                default -> {
                    System.out.println("Invalid option");
                    yield 0;
                }
            };

            if(price>0) {
                System.out.println(item+" added to basket.");
                total+=price;
                countItems++;
            }
        }while(option!=0);

        if(countItems==0) {
            System.out.println("Nothing ordered");
        } else {
            discount=calculateDiscount(total);
            System.out.printf("\nItems: %d", countItems);
            System.out.printf("\nTotal: %.2f", total);
            System.out.printf("\nDiscount: %.2f", discount);
            System.out.printf("\nTo pay: %.2f", (total-discount));
        }
    }

    public static double calculateDiscount(double total) {
        if(total>20) {
            return total*=0.10;
        }

        return 0;
    }
}