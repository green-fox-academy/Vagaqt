import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        Path sourceFile = Paths.get("multipleLines.txt");
        Path targetFile = Paths.get("copyMultipleLinesHere.txt");
        copyFileContent(sourceFile, targetFile);
    }

    private static void copyFileContent(Path sourceFile, Path targetFile) {
        try {
            List<String> copyContent = Files.readAllLines(sourceFile);
            Files.write(targetFile, copyContent);
            List<String> copiedContent = Files.readAllLines(targetFile);
            boolean didWeDoIt = copyContent.equals(copiedContent);
            System.out.println("The following statement is '" + didWeDoIt + "': We successfully copied sourceFiles content!");
        } catch (IOException e) {
        }
    }
}
