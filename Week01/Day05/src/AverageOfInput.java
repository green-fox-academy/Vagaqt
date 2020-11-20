import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        System.out.println("Please enter 5 numbers");
        Scanner aIn = new Scanner(System.in);
        Scanner bIn = new Scanner(System.in);
        Scanner cIn = new Scanner(System.in);
        Scanner dIn = new Scanner(System.in);
        Scanner eIn = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int e;

        a = aIn.nextInt();
        b = bIn.nextInt();
        c = cIn.nextInt();
        d = dIn.nextInt();
        e = eIn.nextInt();

        System.out.println("Sum: " + (a + b + c + d + e) + ", Average: " + ((a + b + c + d + e) / 5.0));

    }
}