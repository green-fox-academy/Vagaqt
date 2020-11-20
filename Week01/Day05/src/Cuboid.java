import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        System.out.println("Please enter the length of your cuboid in meters:");
        Scanner cuboidLength = new Scanner(System.in);
        double length;
        length = cuboidLength.nextDouble();

        System.out.println("Please enter the height of your cuboid in meters:");
        Scanner cuboidHeight = new Scanner(System.in);
        double height;
        height = cuboidHeight.nextDouble();

        System.out.println("Please enter the depth of your cuboid in meters:");
        Scanner cuboidDepth = new Scanner(System.in);
        double depth;
        depth = cuboidDepth.nextDouble();

        System.out.println("The surface area of your cuboid is: " + (2 * (length * depth + length * height + depth * height)) + "square meters.");

        System.out.println("The volume of your cuboid is: " + (length * height * depth) + "cubic meters.");
    }
}