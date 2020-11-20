import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("How many chickens does the farmer have?");
        Scanner numberChickens = new Scanner(System.in);
        int chickens;
        chickens = numberChickens.nextInt();

        System.out.println("How many pigs does the farmer have?");
        Scanner numberPigs = new Scanner(System.in);
        int pigs;
        pigs = numberPigs.nextInt();

        System.out.println("The animals have a total of " + (chickens * 2 + pigs * 4) + " legs together.");


    }
}