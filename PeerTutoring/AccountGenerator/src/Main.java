import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StringBuilder firstName=new StringBuilder(), lastName=new StringBuilder();
        StringBuilder username=new StringBuilder(), password=new StringBuilder();
        String allowed = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!?#$%&";
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int digits=0, passwdLength=0, capitalCount=0, digitsCount=0;

        // Asking for the first and last name
        System.out.print("First name: ");
        firstName.append(sc.next().trim());
        System.out.print("Last name: ");
        lastName.append(sc.next().trim());
        digits=rand.nextInt(10, 100);

        // Generating username
        username.append(firstName.toString().toLowerCase().charAt(0)).append(lastName.toString().toLowerCase()).append(digits);

        // Asking for the password length (8-16)
        do {
            System.out.print("Password length (8-16): ");
            passwdLength = sc.nextInt();

            if(passwdLength<8 || passwdLength>16) {
                System.out.println("Password length must be between 8 and 16");
            }
        }while(passwdLength<8 || passwdLength>16);

        // Generating password with the allowed characters
        for(int i=0;i<passwdLength;i++) {
            password.append(allowed.charAt(rand.nextInt(allowed.length())));
        }

        // Counting capital letters and digits in the password
        for(int i=0;i<passwdLength;i++) {
            char ch=password.charAt(i); // Getting each character
            // Checking if the charachter is capital or a digit
            if(ch>='A' && ch<='Z') {
                capitalCount++;
            } else if(ch>='0' && ch<='9') {
                digitsCount++;
            }
        }

        System.out.printf("Username: %s", username); // Printing username
        System.out.printf("\nPassword: %s", password); // Printing the password
        System.out.printf("\nCapital letters: %d", capitalCount); // Printing amount of capital letters in password
        System.out.printf("\nDigits: %d", digitsCount); // Printing amount of digits in password

        // Checking if password is STRONG
        if(password.length()>=12 && capitalCount>0 && digitsCount>0) {
            System.out.println("\nStrength: STRONG");
        } else {
            System.out.println("\nStrength: WEAK");
        }
    }
}
