public class Power {
    // Given base and n that are both 1 or more, compute recursively (no loops) the
    // value of base to the n power, so powerN(3, 2) is 9 (3 squared).
    public static void main(String[] args) {
        int base = 16;
        int n = 3;

        powerN(base, n);
        System.out.println(powerN(base, n));
    }

    public static int powerN(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            base = powerN(base, n - 1) * powerN(base, n-(n - 1));
            return base;
        }
    }
}
