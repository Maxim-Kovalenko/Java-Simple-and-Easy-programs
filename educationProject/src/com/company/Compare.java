package com.company;

import java.util.Arrays;

public class Compare {
    public static String compare(int[] array){
        for (int i = 0, endI = array.length - 1; i < endI; i++){
            boolean wasSwap = false;
            for (int j = 0, endJ = endI - 1;j < endJ; j++){
                if (array[j] > array[j+1]){
                    int swap = array[j + 1];
                    array[j] = array[j+1];
                    array[j + 1] = swap;
                    wasSwap = true;
                }
            }
            if(!wasSwap){
                break;
            }
        }
        String arrayString = Arrays.toString(array);
        return arrayString;
    }
}
