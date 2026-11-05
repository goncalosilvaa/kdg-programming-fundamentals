// Imports
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=0;
        char gradeChar;
        boolean checker=true;

        while(checker) {
            System.out.print("Enter the score of a student: ");

            if(sc.hasNextInt()) {
                score=sc.nextInt();
                checker=false;
            } else {
                System.out.println("Invalid input. Please try again");
                sc.next();
            }
        }

        if(score>=90) {
            gradeChar='A';
        } else if(score<90 && score>=80) {
            gradeChar='B';
        } else if(score<80 && score>=70) {
            gradeChar='C';
        } else if(score<70 && score>=60) {
            gradeChar='D';
        } else {
            gradeChar='E';
        }

        System.out.printf("The students grade is: %c",gradeChar);

    }
}
