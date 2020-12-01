import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        Path path = Paths.get("duplicated-chars.txt");

        try {
            List<String> duplicatedContent = Files.readAllLines(path);
            for (String content : duplicatedContent) {
                String[] contentParts = content.split("(?<=(.))(?!\\1)");
                System.out.println(Arrays.asList(contentParts));
//                for (int i = 0; i < contentParts.length; i++) {
//                    String[] halved = new String[contentParts.length];
//                    String firstChar = Arrays.toString(new String[]{contentParts[i]});
//                    halved[i] = String.valueOf(firstChar.charAt(0));
//                    System.out.print(Arrays.toString(halved));

            }
        } catch (
                IOException e) {
        }


    }
}