import java.util.Arrays;

public class ArrayPChangeElements {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[1, 2, 3, 8, 5, 6]`
        // - Change the 8 to 4
        // - Print the fourth element
        int[] numbers = {1, 2, 3, 8, 5, 6};
        numbers[3] = 4;
        System.out.println(numbers[3]);
        for (int elements : numbers
        ) {
            System.out.print(elements + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
