// Import
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int prevMileage=0, currentMileage=0;
        float refilledLiters=0, consumptionLiters=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the previous mileage: ");
        prevMileage=sc.nextInt();

        do {
            System.out.print("Enter the current mileage: ");
            currentMileage=sc.nextInt();
        } while(currentMileage<prevMileage);

        do {
            System.out.print("Enter the amount of refilled liters: ");
            refilledLiters=sc.nextFloat();
        } while(refilledLiters<=0);

        consumptionLiters=refilledLiters/(currentMileage-prevMileage)*100;
        System.out.printf("Consumption for %dkm driven: %.2f liters/100km", (currentMileage-prevMileage), consumptionLiters);
    }
}