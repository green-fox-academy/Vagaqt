public class PrintEven {
    public static void main(String[] args) {
        // Create a program that prnts all the even numbers between 0 and 500
        int a = 0;
        while (a < 500) {
            a += 1;
            if (0 == a % 2) {
                System.out.println(a);
            }
        }

    }
}
