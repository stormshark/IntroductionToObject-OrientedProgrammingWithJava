package org.javaturk.ioop.ch17;

import java.util.Scanner;

public class StringImmutability {
    public static void main(String[] args) {
//        run1();
//        run2();
//        run3();
//        run4();
    }

    public static void run1(){
        System.out.println("run1()");

        String s1 = "Java";
        String s2 = s1;
        System.out.println(s1 == s2); // true

        String s3 = s1.concat("");
        System.out.println(s1 == s3); // Still true!

        s1 = "I love" + " " + s1;
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println(s1 == s2); // false

        System.out.println("*************");
        s2 = s1;
        for(int i = 0; i < 10; i++) {
            System.out.println(s1 == s2);
            s2 = s1;
            s1 = s1.concat(" " + i);
        }
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }

    public static void run2(){
        System.out.println("\nrun2()");
        String s1 = "Java";
        String s2 = s1.substring(0);
        System.out.println(s1 == s2);

        String s3 = "Java";
        String s4 = "av";
        String s5 = s3.substring(1, 3);
        System.out.println(s4 + " " + s5);
        System.out.println(s4 == s5);
    }

    public static void run3(){
        System.out.println("\nrun3()");
        String s1 = new String("Java");
        String s2 = "Java";
        System.out.println("s1 == s2 : " + (s1 == s2));

        s1 += " is good.";
        s2 += " is good."; // New object is not in the pool!
        System.out.println(s1 + "\n" + s2);
        System.out.println("s1 == s2 : " + (s1 == s2));

        System.out.println("***********");

        String s3 = s1.intern();
        System.out.println(s1 + "\n" + s2 + "\n" + s3);
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3)); // They refer to the same object in the pool.
        System.out.println("s2 == s3 : " + (s2 == s3)); // Expecting true but it is false!

        System.out.println();

        String s4 = "Java is good.";
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);
        System.out.println("s1 == s4 : " + (s1 == s4));
        System.out.println("s2 == s4 : " + (s2 == s4));
        System.out.println("s3 == s4 : " + (s3 == s4));

        System.out.println("After interning");
        String s5 = s2.intern();
        System.out.println("s4 == s5 : " + (s4 == s5));
    }

    public static void run4() {
        System.out.println("\nrun4()");
        String s1 = new String("Java");
        String s2 = "Java";

        System.out.println("Please enter Java:");
        Scanner sc = new Scanner(System.in);
        String s3 = sc.next(); // Enter "Java" without quotes
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s2 == s3 : " + (s2 == s3));
    }
}
