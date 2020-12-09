import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(4);
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        numbers.add(5);
        System.out.println(SumNumbers(numbers));
    }

    public static int SumNumbers(List<Integer> numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;

    }
}

