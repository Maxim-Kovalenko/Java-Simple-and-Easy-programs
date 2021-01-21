package com.company;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number 1: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter number 2: ");
            int num2 = scanner.nextInt();
            Return.returner(num1, num2);
    }
}
