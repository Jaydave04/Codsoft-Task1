package Codsoft.com;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        do {
            int numberToGuess = random.nextInt(100) ; 
            int attempts =10; 
            System.out.println("Guess the number between 1 to 100. You have " + attempts + " attempts.If  your score is 1 then your guess is correct.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts--;

                if (userGuess == numberToGuess) {
                    System.out.println("That's correct! You've guessed the right number.");
                    score += 1; 
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("It's higher than " + userGuess );
                } else {
                    System.out.println("It's lower than " + userGuess );
                }

                if (attempts > 0) {
                    System.out.println(attempts + " attempts remaining.");
                }
            }

            if (attempts == 0) {
                System.out.println("Out of attempts! The number was " + numberToGuess + ".");
            }

            System.out.println("Your score: " + score);
            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}
