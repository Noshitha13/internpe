import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        while (play.equals("yes")) {
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while (guess != randNum) {
                System.out.print("Guess a number between 1 and 100:");
                guess = sc.nextInt();
                tries++;
                if (guess == randNum) {
                    System.out.println("Awesome! You guessef the number!");
                    System.out.println("It only took you " + tries + " guesses!");
                    System.out.println("Would you like to play again? Yes or No: ");
                    play = sc.next().toLowerCase();
                } else if (guess > randNum) {
                    System.out.println("Your guess is too high, try again.");
                } else {
                    System.out.println("Your guess is too loo, try again.");
                }
            }
        }
        sc.close();}}
    
