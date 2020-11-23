public class SumA {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        sum(5);

//        int b = 0;
//        int n = 5;
//        for (int i = 0; i <= n; i++) {
//            b = b + i;
//        }
//
//        System.out.println(b);
    }

    public static void sum(int a) {
        int n = 0;
        for (int i = 0; i <= a; i++) {
            n = n + i;
        }
        System.out.println(n);
    }
}

