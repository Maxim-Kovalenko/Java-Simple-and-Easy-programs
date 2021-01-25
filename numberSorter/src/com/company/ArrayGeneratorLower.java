package com.company;

import java.util.Arrays;

public class ArrayGeneratorLower {
    public static int[] generate(int[] arr, int mainNumber){
        // Sort the input array
        int[] array = Sorter.sort(arr);
        // Generates the array greater than mainNumber
        int[] outArray = ArrayGeneratorGreater.generator(array, mainNumber);
        int[] outputArr = Arrays.copyOfRange(outArray, 0, outArray.length);
        return outputArr;
    }
}
