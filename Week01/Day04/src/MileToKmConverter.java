import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner mphToKmh = new Scanner(System.in);
        System.out.println("Please enter value in miles per hour(MpH) you'd wish to convert:");
        double mph;
        double kmh;
        mph = mphToKmh.nextDouble();
        kmh = mph * (1.6);
        System.out.println("That'll be " + kmh + " kilometer per hour(Kmh), my friend! :)");
    }
}