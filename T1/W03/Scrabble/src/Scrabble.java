// Imports
import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int points=0;
        char letter = 0;
        boolean checker=true;

        // Validating user input
        while(checker){
            System.out.print("Enter a letter: ");

            if(sc.hasNext()) {
                letter=Character.toUpperCase(sc.next().charAt(0));
                checker=false;
            } else {
                System.out.print("Invalid input.");
                sc.next();
            }
        }

        switch (letter){
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R':
                points+=1;
                break;
            case 'D', 'G':
                points+=2;
                break;
            case 'B', 'C', 'M',  'P':
                points+=3;
                break;
            case 'F', 'H', 'V', 'W', 'Y':
                points+=4;
                break;
            case 'K':
                points+=5;
                break;
            case 'J', 'X':
                points+=8;
                break;
            case 'Q', 'Z':
                points+=10;
                break;
            default:
                System.out.println("Invalid input.");
        }

        System.out.println("You earned "+points+" points.");
        sc.close();
    }
}
