public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        int a = 675248;
        if (1 == (a % 2)) {
            System.out.println("The value of \"a\" is an ODD number");
        } else {
            System.out.println("The value of \"a\" is an EVEN number");
        }
    }
}