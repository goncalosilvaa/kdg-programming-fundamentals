// Imports

public class Main {
    public static void main(String[] args) {
        int[] lotteryNumbers = {3, 6, 17, 31, 32, 43}; // Lottery numbers array list

        // Use a for-loop and the length property to print all numbers on a single line, separated by a space.
        printArray(lotteryNumbers);

        // Change the value of the second number from 6 to 13.
        lotteryNumbers[1]=13;

        // Print the array again to check if the number was modified.
        printArray(lotteryNumbers);

        // Create an array of 20 integers and fill it with multiples of 7 (7, 14, 21, 28, ...). Use a loop to do this.
        int[] multiples = new int[20];
        for(int i=0;i<multiples.length;i++) {
            multiples[i]=7*(i+1);
        }

        // Print the contents of this array using a for-each loop.
        printArray(multiples);

        // Print the contents of this array in reversed order using a regular for-loop.
        printReversedArray(multiples);
    }

    // Copy/paste your solution for assignment "Java 7.02". Replace all for-loops by for-each loops.
    public static void printArray(int[] array){
        for(int lotteryNumber:array){
            System.out.print(lotteryNumber+" ");
        }
        System.out.println();
    }

    // Printing reversed array function
    public static void printReversedArray(int[] array){
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}