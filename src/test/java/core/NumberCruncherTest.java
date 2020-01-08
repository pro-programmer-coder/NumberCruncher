package core;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCruncherTest {

    @Test
    public void single_item_return_test(){
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

}