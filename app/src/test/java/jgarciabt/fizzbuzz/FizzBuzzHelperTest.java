package jgarciabt.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jose Garcia on 01/03/2016.
 */
public class FizzBuzzHelperTest {

    private FizzBuzzHelper fizzBuzzHelper;

    @Before
    public void setUp() {

        fizzBuzzHelper = new FizzBuzzHelper();
    }

    @After
    public void tearDown() {

        fizzBuzzHelper = null;
    }

    @Test
    public void getFizzBuzz_ReturnsFizzForMultiplesOf3() {

        String expected = "Fizz";

        assertEquals(fizzBuzzHelper.getFizzBuzz(3), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(6), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(9), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(12), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(18), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(21), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(24), expected);
    }

    @Test
    public void getFizzBuzz_ReturnsBuzzForMultiplesOf5() {

        String expected = "Buzz";

        assertEquals(fizzBuzzHelper.getFizzBuzz(5), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(10), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(20), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(25), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(35), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(40), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(50), expected);
    }

    @Test
    public void getFizzBuzz_ReturnsFizzBuzzForMultiplesOf3And5() {

        String expected = "FizzBuzz";

        assertEquals(fizzBuzzHelper.getFizzBuzz(15), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(30), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(45), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(60), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(75), expected);
        assertEquals(fizzBuzzHelper.getFizzBuzz(90), expected);
    }

    @Test
    public void getFizzBuzz_ReturnsNumbersForNonMultiplesOf3Or5() {

        assertEquals(fizzBuzzHelper.getFizzBuzz(1), "1");
        assertEquals(fizzBuzzHelper.getFizzBuzz(2), "2");
        assertEquals(fizzBuzzHelper.getFizzBuzz(4), "4");
        assertEquals(fizzBuzzHelper.getFizzBuzz(7), "7");
        assertEquals(fizzBuzzHelper.getFizzBuzz(8), "8");
        assertEquals(fizzBuzzHelper.getFizzBuzz(11), "11");
    }
}