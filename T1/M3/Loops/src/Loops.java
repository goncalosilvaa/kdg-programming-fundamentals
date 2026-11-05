public class Loops {
    public static void main(String[] args) {
        int descNumber=120, multiples=1, powCounter=0;

        // Displays a line with all numbers from 120 to 100 (descending)
        while(descNumber>=100){
            System.out.print(descNumber+" ");
            descNumber--;
        }

        // Displays a line with all multiples of 3 below 50
        System.out.printf("\n");
        while(multiples*3<50) {
            System.out.print((multiples*3)+" ");
            multiples++;
        }

        // Displays a line with the powers of 5 below 10,000
        System.out.printf("\n");
        while(Math.pow(5, powCounter)<10000) {
            System.out.print(Math.pow(5, powCounter)+" ");
            powCounter++;
        }
    }
}
