package ru.levelp.examples.files;

import java.math.BigInteger;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("  1   20   test   EXTRA");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.nextLine();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("s = " + s);


    }
}
