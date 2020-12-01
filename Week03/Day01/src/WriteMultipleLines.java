import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.

        int lines = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word:");
        String word = scanner.next();
        Path location = Paths.get("multipleLines.txt");

        writeRepeatedLines(lines, word, location);

    }

    private static void writeRepeatedLines(int lines, String word, Path location) {
        for (int i = 0; i < lines; i++) {
            try {
                Files.write(location, Arrays.asList(word), StandardOpenOption.APPEND);
            } catch (IOException e) {
            }
            ;
        }
    }
}
