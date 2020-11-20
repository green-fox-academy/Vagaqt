public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        int a = 8;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a + (a - 1); j++) {
                if (j == a - 1) {
                    System.out.print("*");
                } else if (j >= (a - 1) - i && j <= (a - 1) + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
