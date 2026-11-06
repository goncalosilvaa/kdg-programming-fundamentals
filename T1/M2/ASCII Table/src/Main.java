// Imports
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int userChar;

        // Asking for user input to choose a character
        System.out.print("Enter a number (32..127): ");
        userChar=sc.nextInt();

        if(userChar<32 || userChar>127){
            System.exit(0);
        } else {
            System.out.println("Your character is: "+(char)userChar+" ("+userChar+")");
        }

        for(char c=32;c<=255;c++){
            System.out.printf("%c  ( %d)\t", c, (int)c);

            if(c%6==1) {
                System.out.print("\n");
            }
        }
    }
}