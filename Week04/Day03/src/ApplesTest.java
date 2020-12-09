import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplesTest {

    @Test
    public void inputEqualsOutput(){
        String expected = "apple";
        String actual = Apples.getApple();
        assertEquals(expected, actual);
    }
}
