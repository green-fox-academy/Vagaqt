import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class CountLetterTest {

    @Test
    public void CountLetterHashMapTest() {

        Map<Character, Integer> cltest = new HashMap<>();
        cltest.put('p',2);
        cltest.put('a',1);
        cltest.put('e',1);
        cltest.put('l',1);


        assertTrue(cltest.equals(CountLetters.countLettersInHashMap("apple")));

    }
}
