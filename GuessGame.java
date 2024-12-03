// GuessGame.java
// Kameron Ibraheem
// Lab03: GuessGame
//
//

import java.util.Scanner;

public class GuessGame{
    public static void main(String[] args) {
        // generate a random # between 1 and 10
        int randomNumber = (int) (Math.random() * (10 - 1 + 1)) + 1;
        
		//
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int i = 0;
		
		// i = Number of guesses
        System.out.println("Hello. Let's play a guessing game!");
        
        // while loop to repeatedly ask for guesses
		// checks if userGuess is NOT equal to random number
        while (userGuess != randomNumber) {
            System.out.print("Guess a number from 1 to 10: ");
            userGuess = scanner.nextInt();
            i++;

            // provide hints based on the guess
			// if userguess is less than the randomNumber then it prints
			// too low and lets user guess again
            if (userGuess < randomNumber) {
                System.out.println("Too low! Guess again.");
			//if the userGuess is greater than the randomNumber then it will print
			//	too high		
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Guess again.");
            }
        }

        // winning message
		// the i represents the amount of attempts it took the user to guess
        System.out.println("You guessed it in " + i + " guesses!");
        
    }
}
