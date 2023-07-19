import java.util.Scanner;

public class GuessTheNumber {
    
    public static void main(String[] args) {
        
        Game();
        }

    public static void Game() {
                    
        Scanner scanner = new Scanner(System.in);

        int K = 5;
        int targetNumber = 1 + (int)(100 * Math.random());
        System.out.println(targetNumber); // delete for final draft
        
        double userGuess;
        int i;
        System.out.println("Guess the random number between 1 and 100 within 5 attempts.");

        for (i = 0; i < K; i++){

            System.out.print("Enter your guess: ");
            userGuess = scanner.nextDouble();

            if (userGuess == targetNumber){
                System.out.println("Congratulations, you guessed the number in " + (i+1) + " tries");
                break;
                }
            else if (userGuess < 1 || userGuess > 100) {
                System.out.println("Pick a number between 1 and 100. You have " + (K - (i+1)) + " guesses remaining");
            }
            else if (userGuess < targetNumber)
                System.out.println("Your guess is less than the random number. You have " + (K - (i+1)) + " guesses remaining.");
            else if (userGuess > targetNumber)
                System.out.println("Your guess is greater than the random number. You have " + (K - (i+1)) + " guesses remaining.");
            else 
                System.out.println("Invalid input, pick a number between 1 and 100. You have " + (K - (i+1)) + " guesses remaining");
            }
        if (i == K)
            System.out.println("You used all of your guesses. The number was " + targetNumber + ".");
        }
        
        
    }
    
// check for non-numeric inputs

