// Imports

public class Main {
    public void main(String[] args) {
        int[] numbers = new int[5];
        double[] stockMarketRates = new double[20];
        boolean[] switches = new boolean[8];
        String[] words = new String[4];

        System.out.printf("%d\n", numbers[0]);
        System.out.printf("%f\n", stockMarketRates[0]);
        System.out.printf("%b\n", switches[0]);
        System.out.printf("%s\n", words[0]);
        System.out.printf("---------------------------\n");
        System.out.printf("%d\n", numbers[numbers.length-1]);
        System.out.printf("%f\n", stockMarketRates[stockMarketRates.length-1]);
        System.out.printf("%b\n", switches[switches.length-1]);
        System.out.printf("%s\n", words[words.length-1]);
    }
}