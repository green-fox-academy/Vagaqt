public class Factorial {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        factorio(6);
    }
    public static void factorio(int a){
        int n = 1;
        for (int i = 1; i <= a; i++) {
            n = n * i;
        }
        System.out.println(n);
    }
}
