package org.javaturk.ioop.ch15;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static String readString(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }

    public static String readLine(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static double readDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
