public class BunniesAgain {
    // We have bunnies standing in a line,
// numbered 1, 2, 3, 4, ...
// The odd bunnies (2, 4, ...) have the normal 2 ears.
// The even bunnies (1, 3, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).

    public static void main(String[] args) {
        int n = 6;
        System.out.println(bunnies(n));
    }

    public static int bunnies(int n) {
        if (n == 1) {
            return n + n + n;
        } else {
            return (n % 2) + 2 + (bunnies(n - 1));

        }
    }
}
