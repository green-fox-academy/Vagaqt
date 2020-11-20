import java.util.Scanner;

public class ParameticAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4
        Scanner num = new Scanner(System.in);
        double numbers;
        System.out.println("How many numbers would you want to use?");
        numbers = num.nextDouble();

        Scanner sum = new Scanner(System.in);
        double a;
        double b = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Please enter a number:");
            a = sum.nextDouble();
            b = b + a;
        }
        System.out.println("Sum: " + b+"Average: "+ b/numbers);
    }
}
