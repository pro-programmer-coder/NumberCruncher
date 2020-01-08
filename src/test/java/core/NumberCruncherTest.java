package core;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCruncherTest {

    @Test
    public void single_item_return_test() throws EmptyArrayException{
        //arrange
        int expected = 3;
        int actual;
        int[] input = new int[]{3};
        NumberCruncher cut = new NumberCruncher();

        //act
        actual = cut.highestIntArray(input);

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void two_int_sort_biggest_first() throws EmptyArrayException{
        //arrange
        int expected = 13;
        int actual;
        int[] input = new int[]{13, 4};
        NumberCruncher cut = new NumberCruncher();

        //act
        actual = cut.highestIntArray(input);

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void two_int_sort_biggest_not_first() throws EmptyArrayException{
        //arrange
        int expected = 13;
        int actual;
        int[] input = new int[]{7,13};
        NumberCruncher cut = new NumberCruncher();

        //act
        actual = cut.highestIntArray(input);

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void same_value_twice() throws EmptyArrayException{
        //arrange
        int expected = 13;
        int actual;
        int[] input = new int[]{13,13};
        NumberCruncher cut = new NumberCruncher();

        //act
        actual = cut.highestIntArray(input);

        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void biggest_int_sort() throws EmptyArrayException{
        //arrange
        int expected = 11;
        int actual;
        int[] input = new int[]{4,5,-8,3,11,-21,6};
        NumberCruncher cut = new NumberCruncher();

        //act
        actual = cut.highestIntArray(input);

        //assert
        assertEquals(expected,actual);
    }

    @Test()
    public void empty_array_test() throws EmptyArrayException{
        int actual;
        int[] input = new int[]{};
        NumberCruncher cut = new NumberCruncher();

        //act
        try {
            actual = cut.highestIntArray(input);
            fail("Array too big in test");
        }catch(EmptyArrayException e){
            assertTrue(true);
        }

    }

}