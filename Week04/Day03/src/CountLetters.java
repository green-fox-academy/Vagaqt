import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {

        countLettersInHashMap("apple");
        printHash(countLettersInHashMap("apple"));


    }

    public static HashMap<Character, Integer> countLettersInHashMap(String string) {
        HashMap<Character, Integer> letters = new HashMap<>();
        char[] stringArray = string.toCharArray();
        for (char c : stringArray) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }
        return letters;
    }

    public static void printHash (HashMap<Character, Integer> letters) {
        for (
                Map.Entry entry : letters.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}



