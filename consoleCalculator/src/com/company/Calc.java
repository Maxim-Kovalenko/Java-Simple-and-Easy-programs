package com.company;

public class Calc {
    public static void calculate(int a, int b, String char_){
        switch (char_){
            case "+":
                int sum1 = a + b;
                System.out.println("Amount is: " + sum1);
                break;
            case "-":
                int sum2 = a - b;
                System.out.println("Amount is: " + sum2);
                break;
            case "*":
                int sum3 = a * b;
                System.out.println("Amount is: " + sum3);
                break;
            case "/":
                int sum4 = a / b;
                System.out.println("Amount is: " + sum4);
                break;
        }
    }
}
