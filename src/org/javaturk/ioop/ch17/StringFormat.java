package org.javaturk.ioop.ch17;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StringFormat {

    public static void main(String[] args) {

        String s1 = "Ayvalik";
        String s2 = String.format("My home town is %s :)", s1);
        System.out.println(s2);
        s2 = String.format("My home town is %10s :)", s1);
        System.out.println(s2);
        s2 = String.format("My home town is %-10s :)\n", s1);
        System.out.println(s2);
        String s3 = String.format("I graduated from Ayvalik High School in %d.\n", 1984);
        System.out.println(s3);
        s3 = String.format("I graduated from Ayvalik High School in %20d.\n", 1984);
        System.out.println(s3);
        s3 = String.format("I graduated from Ayvalik High School in %-20d.\n", 1984);
        System.out.println(s3);
        String s4 = String.format("And my GPA was %f.", 6.29);
        System.out.println(s4);
        s4 = String.format("And my GPA was %10.2f.", 6.29);
        System.out.println(s4);
        s4 = String.format("And my GPA was %-10.2f.", 6.29);
        System.out.println(s4);

        Calendar calendar = new GregorianCalendar(1968, 2, 17);
        String s5 = String.format("My birthday: %1$tm %1$te, %1$tY", calendar);
        System.out.println(s5);
        s5 = String.format("My birthday: %1$tB %1$te, %1$tY\n", calendar);
        System.out.println(s5);
    }
}

