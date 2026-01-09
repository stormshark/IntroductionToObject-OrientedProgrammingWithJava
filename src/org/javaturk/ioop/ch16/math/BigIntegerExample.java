package org.javaturk.ioop.ch16.math;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the limit:");
		int limit = in.nextInt();

		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i <= limit; i++) {
			sum = sum.add(BigInteger.valueOf(i));
		}

		System.out.println("Sum as big integer: " + sum);

//		System.out.println("*** But this may cause problems. ***");
		System.out.println("Sum as long:        " + sum.longValue());
		System.out.println("Sum as int:         " + sum.intValue());

		BigInteger factorial = BigInteger.valueOf(1);
		for (int i = 1; i <= limit; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		System.out.println("Factorial as big integer: " + factorial);
		System.out.println("Factorial as long:        " + factorial.longValue());
		System.out.println("Factorial as int:         " + factorial.intValue());
	}
}
