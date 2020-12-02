package Main;

import java.util.Objects;
import java.util.Scanner;

//Create Counter class
//which has an integer field value
//                when creating it should have a default value 0 or we can specify it when creating
//        we can add(number) to this counter another whole number
//        or we can add() without parameters just increasing the counter's value by one
//        and we can get() the current value
//        also we can reset() the value to the initial value
public class Counter {
    public Integer Number;
    public int startingNumber;

    public Counter(Integer newStartingNumber) {
        Number = Objects.requireNonNullElse(newStartingNumber, 0);
        startingNumber = newStartingNumber;
    }

    public void add(int number) {
        Number += number;
        System.out.println("Added " + number + " to the number");
        System.out.println("New number is: " + Number);
    }

    public void add() {
        Number++;
        System.out.println(("Added 1 to the number"));
        System.out.println("New number is: " + Number);
    }

    public void get() {
        System.out.println("Your number is: " + Number);
    }

    public void reset() {
        Number = startingNumber;
        System.out.println("Counter reset. Your number is: " + Number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Counter game = new Counter(a);

    }
}
