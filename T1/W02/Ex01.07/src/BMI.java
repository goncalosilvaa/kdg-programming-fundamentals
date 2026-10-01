import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height=0, weight=0, bmi=0;

        System.out.println("Dear patient, this program will calculate your BMI.");
        height=getValidInput(sc, "Please enter your height in meters (0.5m - 2.5m):", 0.5, 2.5);
        weight=getValidInput(sc, "Please enter your weight in kilograms (1kg - 600kg):", 1.0, 600.0);

        // Process BMI
        bmi=weight/(height*height);
        System.out.printf("Your BMI is %.2f%n (%s)", bmi, getBMICategory(bmi));

        sc.close();
    }

    // Validating inputs
    private static double getValidInput(Scanner sc, String prompt, double min, double max) {
        double value;

        while(true){
            System.out.print(prompt);

            if(sc.hasNextDouble()){
                value=sc.nextDouble();

                if(value>=min && value<=max) {
                    return value;
                } else {
                    System.out.println("Error: Please enter a value between "+min+" and "+max+".");
                }
            } else  {
                System.out.println("Error: Invalid input. Please enter a valid value.");
                sc.next();
            }
        }
    }

    // Returning BMI category
    private static String getBMICategory(double bmi) {
        if(bmi<18.5){
            return "Underweight";
        } else if(bmi<25.4){
            return "Normal";
        }  else if(bmi<27.9){
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
