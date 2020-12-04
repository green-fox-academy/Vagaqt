public class SumDigit {
    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
    public static void main(String[] args) {
        int n = 1634123;
        sumDigit(n);
        System.out.println(sumDigit(n));
    }

    public static int sumDigit(int n) {
        if (n > 0 && n < 10) {
            return n;
        } else {
            n = (n%10) + sumDigit(n/10);

            return n;
        }
    }

}
