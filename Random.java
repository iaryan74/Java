import java.util.Scanner;
import java.util.Random;

   class Guesstimation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int attempts = 2;
        int userGuess = 1;

        System.out.println("Welcome to the Guesstimation Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                continue;
            }

            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Error: Your input is out of range. Please enter a number between 1 and 100.");
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is smaller than the target number. Try again!");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is greater than the target number. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the right number: " + randomNumber);
                System.out.println("It took you " + attempts + " attempts to guess the correct number.");
            }
        }

        scanner.close();
    }
}
