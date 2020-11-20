import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Please enter two numbers");
        Scanner numberA = new Scanner(System.in);
        Scanner numberB = new Scanner(System.in);
        double a;
        double b;
        a = numberA.nextDouble();
        b = numberB.nextDouble();

        if (a > b) {
            System.out.println("The bigger number is: " + a);
        } else {
            System.out.println("The bigger number is: " + b);
        }
    }
}