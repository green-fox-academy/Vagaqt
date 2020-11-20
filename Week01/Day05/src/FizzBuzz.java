public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
        for (int i = 0; i <= 100; i++) {
            if (0 == i % 3 && 0 != i % 5) {
                System.out.println("Fizz");
            } else if (0 == i % 5 && 0 != i % 3) {
                System.out.println("Buzz");
            } else if (0 == i % 3 && 0 == i % 5) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
