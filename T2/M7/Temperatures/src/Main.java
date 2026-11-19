import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    final int NUMBER_OF_TEMPERATURES=3;
    double[] temperatures=new double[NUMBER_OF_TEMPERATURES];

    public void main(String[] args) {
        enterTemperatures();
        displayTemperatures(temperatures);
    }

    // ask the user for 7 temperatures. Store them in an array.
    public void enterTemperatures() {
        Scanner sc=new Scanner(System.in);
        boolean isValid=false;

        System.out.printf("Please enter %d temperatures:\n", NUMBER_OF_TEMPERATURES);
        for(int i=0;i<temperatures.length;i++) {
            do {
                System.out.printf("Day %d: ", i + 1);

                if(sc.hasNextDouble()) {
                    double temp=sc.nextDouble();

                    if(temp>=-90.0 && temp<=60.0) {
                        temperatures[i]=temp;
                        isValid=true;
                    } else {
                        System.out.println("Temperature out of range. Please enter a number between -90 and 60.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a numeric value.");
                    sc.next();
                }
            }while(!isValid);
        }
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