package org.javaturk.ioop.ch18.newApi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		Duration oneHours1 = Duration.ofHours(1);
		Duration oneHours2 = Duration.of(1, ChronoUnit.HOURS);
		
		LocalDateTime myBirthDay = LocalDateTime.of(1968, 3, 17, 10, 20, 55);
		System.out.println("My Birth Day: " + myBirthDay);

		LocalDateTime newDate = LocalDateTime.of(2016, Month.NOVEMBER, 9, 10, 21, 56);
		System.out.println(newDate);

		Duration duration = Duration.between(myBirthDay, newDate);
		System.out.println("Duration: " + duration);
		System.out.println(duration.getSeconds() + " seconds");
	}
}
