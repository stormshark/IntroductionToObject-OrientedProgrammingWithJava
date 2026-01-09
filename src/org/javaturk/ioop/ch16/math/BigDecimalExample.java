package org.javaturk.ioop.ch16.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        basics ();
        rounding();
    }

    static void basics(){
        BigDecimal bd = BigDecimal.valueOf(12332423423.123456789123456789123456789123456789123456789);
        System.out.println("Precision: " + bd.precision());
        System.out.println("Scale: " + bd.scale());

        bd = BigDecimal.valueOf(Math.PI);
        System.out.println("Precision: " + bd.precision());
        System.out.println("Scale: " + bd.scale());
        System.out.println("Square of " + bd + " " + bd.multiply(bd));

        BigDecimal radius = BigDecimal.TEN;
        BigDecimal area = bd.multiply(radius).multiply(radius).multiply(radius);
        System.out.println("Area: " + area);
    }

    static void rounding(){
        double d1 = 10;
        double d2 = 3;
        System.out.println("10/3 = " + d1 / d2);

        BigDecimal bd1 = BigDecimal.TEN;
        BigDecimal bd2 = BigDecimal.valueOf(3.0);
//		System.out.println("10/3 = " + bd1.divide(bd2)); // java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.DOWN));
        System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.CEILING));
        System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.FLOOR));
        System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.UP));
//		System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.UNNECESSARY)); // java.lang.ArithmeticException: Rounding necessary

        System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.valueOf(1)));
        System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.valueOf(2)));
        System.out.println("10/3 = " + bd1.divide(bd2, RoundingMode.valueOf(3)));

        System.out.println("\nScaling");
        BigDecimal bd3 = new BigDecimal(d1 / d2);
        System.out.println("Scale: 1, CEILING -> 10/3 = " + bd3.setScale(1, RoundingMode.CEILING));
        System.out.println("Scale: 2, CEILING -> 10/3 = " + bd3.setScale(2, RoundingMode.CEILING));
        System.out.println("Scale: 3, CEILING -> 10/3 = " + bd3.setScale(3, RoundingMode.CEILING));
        System.out.println("Scale: 10, CEILING -> 10/3 = " + bd3.setScale(10, RoundingMode.CEILING));

        System.out.println("Scale: 1, FLOOR -> 10/3 = " + bd3.setScale(1, RoundingMode.FLOOR));
        System.out.println("Scale: 2, FLOOR -> 10/3 = " + bd3.setScale(2, RoundingMode.FLOOR));
        System.out.println("Scale: 3, FLOOR -> 10/3 = " + bd3.setScale(3, RoundingMode.FLOOR));
        System.out.println("Scale: 10, FLOOR -> 10/3 = " + bd3.setScale(10, RoundingMode.FLOOR));
    }
}
