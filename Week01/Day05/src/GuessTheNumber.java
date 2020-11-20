import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8
        int number = 8;
        int guess;
        Scanner userGuess = new Scanner(System.in);
        System.out.println("Guess the number!");
        for (int i = 0; ; i++) {
            // I just learned that "for (;;)" isn't illegal and it blew my mind
            guess = userGuess.nextInt();
            if (guess < number) {
                System.out.println("The stored number is higher");
            } else if (guess > number) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found the number: " + number);
                break;
            }
        }
    }
}