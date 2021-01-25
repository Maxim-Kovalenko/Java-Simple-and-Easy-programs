package com.company;

import java.util.Arrays;

public class ArrayGeneratorGreater {
    public static int[] generator(int[] arr, int mainNumber){
        int[] array = Sorter.sort(arr);
        int[] outputArr;
        int i = 0;
        while (i != array.length || array[i] == mainNumber){
            if (array[i] > mainNumber){
                    outputArr = Arrays.copyOfRange(array,array[i -1], array.length);
                    return outputArr;
                }
            i++;
            }
            return array;
    }
}