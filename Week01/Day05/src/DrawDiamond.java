public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        //
        //
        // DISCLAIMER: I'm not proud of this solution.
        // It is a solution, but not a nice one. Will do better.
        int a = 7;
        for (int i = 0; i < a / 2 + 1; i++) {
            for (int j = 0; j < a; j++) {
                if (j >= a / 2 - i && j <= a / 2 + i) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
        for (int k = 0; k < a / 2; k++) {
            for (int l = 0; l < a; l++) {
                if (l == a / 2) {
                    System.out.print("*");
                } else if (k + 1 <= l && l < a / 2) {
                    System.out.print("*");
                } else if (l + 1 < a - k && l > a / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}