package core;

import java.util.Arrays;

public class NumberCruncher {
    public int highestIntArray(int[] input){
//        if(input.length == 1){
//            return input[0];
//        }
//        if(input[0] > input[1]){
//            return input[0];
//        }
//        else{
//            return input[1];
//        }

        return Arrays.stream(input).max().orElse(0);
    }
}
