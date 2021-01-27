package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {2, 4, 6, 10, 5, 1, 8, 7, 3, 9};
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();;
        System.out.println(Arrays.toString(ArrayGeneratorGreater.generator(array, inputNumber)));
        System.out.println(Arrays.toString(ArrayGeneratorLower.generate(array, inputNumber)));
        //Sorter.sort(array);
        //int[] arr = Sorter.sort(array);
        //System.out.println(Arrays.toString(arr));
    }
}
