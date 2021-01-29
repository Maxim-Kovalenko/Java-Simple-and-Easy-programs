package com.company;

public class Factorial {
    public static int calculate(int num){
        int res = 1;
        int i = 1;
        while (i != num+1){
            int search_factorial = res * i;
            res = search_factorial;
            i++;
        }
        return res;
    }
}
