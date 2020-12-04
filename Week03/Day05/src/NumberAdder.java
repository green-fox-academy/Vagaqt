public class NumberAdder {
    // Write a recursive function that takes one parameter: n and
    // adds numbers from 1 to n.
    public static void main(String[] args) {
        int n = 3;
        numberAdder(n);
        System.out.println(numberAdder(n));
    }

    public static int numberAdder(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + numberAdder(n-1);
        }
    }

}
