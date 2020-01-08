package core;

import java.util.Arrays;

public class NumberCruncher {
    public int highestIntArray(int[] input) throws EmptyArrayException{
        return Arrays.stream(input).max().orElseThrow(() -> new EmptyArrayException("Array Empty"));
    }
}
