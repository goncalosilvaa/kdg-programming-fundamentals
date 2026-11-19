import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {
                12, 17, 14, 18, 13, 13, 14, 17, 17, 16,
                10, 18, 13, 18, 12, 12, 10, 17, 10, 15,
                10, 11, 16, 12, 16, 11, 8, 10, 16, 14,
                17, 7, 11, 10, 15, 10, 14, 8, 9, 14
        };

        System.out.printf("The average is %.3f", arrayAverage(numbers));
    }

    public static double arrayAverage(int[] array) {
        double average=0;
        double sum=0;

        for(int number:array) {
            sum+=number;
        }
        average=sum/array.length;
        return average;
    }
}