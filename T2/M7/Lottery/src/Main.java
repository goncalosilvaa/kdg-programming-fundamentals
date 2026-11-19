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
  }

  public static void printArray(int[] array){
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
}