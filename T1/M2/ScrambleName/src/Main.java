// Imports
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String name;
    Random rand=new Random();

    System.out.print("Enter your name: ");
    name=sc.nextLine();

    StringBuilder remainingLetters=new StringBuilder(name.replace(" ", ""));
    StringBuilder shuffledName=new StringBuilder();

    while(!remainingLetters.isEmpty()){
      int randomIndex=rand.nextInt(remainingLetters.length());
      shuffledName.append(remainingLetters.charAt(randomIndex));
      remainingLetters.deleteCharAt(randomIndex);
    }

    System.out.printf("Hi %s, your scrambled name is %s", name,  shuffledName);
  }
}