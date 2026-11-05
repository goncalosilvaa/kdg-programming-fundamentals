// Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight=0, length=0, bmi=0;

        System.out.print("Enter weight in kilograms: ");
        weight=sc.nextFloat();
        System.out.print("Enter length in meters: ");
        length=sc.nextFloat();

        // Calculating BMI
        bmi=weight/(length * length);

        System.out.printf("Your BMI is: %.2f", bmi);
        if(bmi<18){
            System.out.print("\nUnderweight");
        } else if(bmi>=18 && bmi<25){
            System.out.print("\nHealthy weight");
        } else if(bmi>=25 && bmi<30){
            System.out.print("\nOverweight");
        } else if(bmi>=30){
            System.out.print("\nObese");
        }
    }
}