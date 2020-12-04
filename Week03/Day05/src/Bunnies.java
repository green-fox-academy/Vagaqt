public class Bunnies {
    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        int n = 10;
        bunnyEars(n);
        System.out.println(bunnyEars(n));

    }

    public static int bunnyEars(int n) {
        if (n == 1) {
            return n + n;
        } else {
            return 2+(bunnyEars(n - 1));
        }

    }
}