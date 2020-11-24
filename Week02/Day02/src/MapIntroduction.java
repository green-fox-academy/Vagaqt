import java.util.Arrays;
import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
        HashMap<Integer, String> mapIntro = new HashMap<>();
        System.out.println(mapIntro);
        mapIntro.put(97, "a");
        mapIntro.put(98, "b");
        mapIntro.put(99, "c");
        mapIntro.put(65, "A");
        mapIntro.put(66, "B");
        mapIntro.put(67, "C");
        System.out.println(Arrays.asList(mapIntro));
        for (Integer key : mapIntro.keySet()) {
            System.out.println("Key: " + key);
        }
        for (String value : mapIntro.values()) {
            System.out.println("Value: " + value);
        }
        mapIntro.put(68, "D");

//        Print how many key-value pairs are in the map
        System.out.println(mapIntro.size());
//        Print the value that is associated with key 99
        String value = mapIntro.get(99);
        System.out.println("Value: " + value);
//        Remove the key-value pair where with key 97
        mapIntro.remove(97);
//        Print whether there is an associated value with key 100 or not
        System.out.println(searchValue(mapIntro, 100));
//        Remove all the key-value pairs
        mapIntro.clear();
    }


    private static boolean searchValue(HashMap<Integer, String> mapIntro, Integer n) {
        for (Integer key : mapIntro.keySet()) {
            if (key == n) {
                return true;
            }
        }
        return false;
    }
}

