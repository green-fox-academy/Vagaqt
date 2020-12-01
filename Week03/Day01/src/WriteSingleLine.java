import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        WriteNameIntoFile(scanner);
    }

    private static void WriteNameIntoFile(Scanner scanner) {
        String name = scanner.next();

        try {
            Path path = Paths.get("my-file.txt");
            Files.write(path, Arrays.asList(name));
        } catch (IOException e) {
            System.out.println("Unable to write file:my-file.txt");
        }
    }
}