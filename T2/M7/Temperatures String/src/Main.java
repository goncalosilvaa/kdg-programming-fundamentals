import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    final int NUMBER_OF_TEMPERATURES=3;
    String[] tempInput;
    double[] temperatures=new double[NUMBER_OF_TEMPERATURES];

    public void main(String[] args) {
        enterTemperatures();
        displayTemperatures(temperatures);
    }

    // ask the user for 7 temperatures. Store them in an array.
    public void enterTemperatures() {
        Scanner sc=new Scanner(System.in);
        boolean isValid=false;

        do {
            System.out.printf("Please enter %d temperatures (separated by a comma): ", NUMBER_OF_TEMPERATURES);
            tempInput = sc.nextLine().split(",");

            if(tempInput.length<NUMBER_OF_TEMPERATURES) {
                System.out.printf("You have to introduce a minimum of %d temperatures!\n", NUMBER_OF_TEMPERATURES);
                continue;
            }

            try {
                for(int i=0;i<NUMBER_OF_TEMPERATURES;i++) {
                    temperatures[i]=Double.parseDouble(tempInput[i]);
                }
                isValid=true;
            } catch(NumberFormatException e) {
                System.out.println("Please enter a valid input!");
            }
        } while(!isValid);
    }

    // display these temperatures in a nicely aligned table
    public void displayTemperatures(double[] array) {
        StringBuilder sb=new StringBuilder();
        double sum=0;

        try(Formatter fmt=new Formatter(sb,Locale.FRANCE)) {
            fmt.format("%nSummary:%n");
            fmt.format("=================%n");

            for (int i = 0; i < array.length; i++) {
                fmt.format("Day %d:%11.1f%n", i+1, array[i]);
            }

            fmt.format("=================%n");

            // calculate the average temperature and display it.
            for(double temp:array) {
                sum+=temp;
            }
            fmt.format("Average: %.2f%n", sum/array.length);
        }

        System.out.print(sb.toString());
    }
}