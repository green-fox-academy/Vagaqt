import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        //// Create a program that asks for two numbers
        //// If the second number is not bigger than the first one it should print:
        //// "The second number should be bigger"
        ////
        //// If it is bigger it should count from the first number to the second by one
        ////
        //// example:
        ////
        //// first number: 3, second number: 6, should print:
        ////
        //// 3
        //// 4
        //// 5

        Scanner a = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber;
        firstNumber = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Please enter second number:");
        int secondNumber;
        secondNumber = b.nextInt();

        int i;
        i = secondNumber;

        if (secondNumber <= firstNumber) {
            System.out.println("The second number should be bigger");
            while (i < firstNumber) {
                System.out.println(i);
                i += 1;
            }
        }
    }
}
