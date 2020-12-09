import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumTest {
    List<Integer> integerList;
    @Before
    public void setup(){
        integerList = new ArrayList<>();
    }

    @Test
    public void SumTestWorksAsIntended(){
        int expected = 30;
        integerList.add(10);
        integerList.add(10);
        integerList.add(10);
        int actual = Sum.SumNumbers(integerList);
        assertEquals(expected, actual);
    }

    @Test
    public void SumTestWorksWithNull(){
        int expected = 0;
        int actual = Sum.SumNumbers(integerList);
        assertEquals(expected, actual);
    }

    @Test
    public void SumTestWorksWithOneElement(){
        int expected =5;
        integerList.add(5);
        int actual = Sum.SumNumbers(integerList);
        assertEquals(expected, actual);
    }

}
