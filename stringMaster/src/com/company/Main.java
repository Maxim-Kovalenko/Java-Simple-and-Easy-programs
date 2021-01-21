package com.company;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Enter number 1: ");
            String str1 = scanner.next();
            //System.out.println("Enter number 2: ");
            String str2 = scanner.next();
            Return.returner(str1, str2);
    }
}
