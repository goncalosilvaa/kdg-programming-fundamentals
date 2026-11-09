// Imports
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int turnedOn=0;
    boolean op, isValidInput=false;

    for(int i=1;i<4;i++) {
      do {
        System.out.printf("Enter the state of switch %d (true or false): ", i);

        if(sc.hasNextBoolean()) {
          isValidInput=true;
          op=sc.nextBoolean();

          if(op) {
            turnedOn++;
          }

        } else {
          isValidInput=false;
          System.out.print("Invalid input!\n");
          sc.next();
        }
      } while(!isValidInput);
    }

    if(turnedOn>=2) {
      System.out.print("At least two switches are turned on.\n");
    }

    if(turnedOn==2) {
      System.out.print("Exactly two switches are turned on.\n");
    }

    if(turnedOn==1) {
      System.out.print("At most one switch is turned on.\n");
    }
  }
}