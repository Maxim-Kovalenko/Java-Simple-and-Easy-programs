package com.company;

import java.util.Arrays;

public class Compare {
    public static String compare(int[] array){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                    String arrayString = Arrays.toString(array);
                    System.out.println(arrayString);
                }
            }
        }
        String arrayString = Arrays.toString(array);
        return arrayString;
    }
}
