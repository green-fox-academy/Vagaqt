import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        int divisor;
        divider();
    }

    private static void divider() {
        int divisor;
        int number;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a number:");
        number = userInput.nextInt();

        try {
            divisor = 10 / number;
            System.out.println("Result:" + divisor);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}
