import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElement {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`
        String[] orders = new String[]{"first", "second", "third"};
        String swap = orders[2];
        orders[2] = orders[0];
        orders[0] = swap;
        System.out.println(Arrays.toString(orders));

    }
}
