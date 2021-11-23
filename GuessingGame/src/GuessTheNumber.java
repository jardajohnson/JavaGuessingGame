import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);

        int playerPoints = 10;
        int guessesRemaining = 10;
        int playerGuess;
        int secretNumber = rand.nextInt(100) + 1;

        System.out.println("""
                Welcome to JavaGuessingGame!
                
                HOW TO PLAY: The player begins the game with 10 points and has 10 chances
                  to guess the secret randomly generated number(.
                  
                  An INCORRECT guess will result in a 1 point deduction from Player's points.
                  *Player will receive a hint after each INCORRECT guess*
                  
                  Guess the CORRECT number before running out of guesses to win!
                  """);
        while(true) {

            System.out.println(guessesRemaining + " attempt(s) remaining.");
            System.out.println("Enter your best guess!(1 - 100)");
            playerGuess = scnr.nextInt();



            if (playerGuess == secretNumber) {
                System.out.println("Congratulations! Your guess was correct!");
                System.out.println("Player Points: " + playerPoints);
                break;
            }
            else if (playerGuess > secretNumber) {
                System.out.println("Incorrect! The secret number is LOWER. Try again!");
                guessesRemaining--;
                playerPoints--;
            }
            else {
                System.out.println("Incorrect! The secret number is HIGHER. Try again!");
                guessesRemaining--;
                playerPoints--;
            }

            if (guessesRemaining == 0) {
                System.out.println("Game Over! You ran out of guesses!");
                break;
            }


        }


    }
}
