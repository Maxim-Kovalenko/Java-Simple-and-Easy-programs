package com.company;

import java.util.Arrays;

public class ArrayGeneratorLower {
    public static int[] generate(int[] arr, int mainNumber){
        int[] array = Sorter.sort(arr);
        int[] outputArr;
        int i = 0;
        while (i != array.length || array[i] == mainNumber){
            if (array[i] > mainNumber){
                outputArr = Arrays.copyOfRange(array,0, array[i -2]);
                return outputArr;
            }
            i++;
        }
        return array;
    }
}
