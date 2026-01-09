package org.javaturk.ioop.ch18.newApi.local;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		System.out.println("Hour: " + now.getHour());
		System.out.println("Minute " + now.getMinute());
		System.out.println("Second: " + now.getSecond());
		System.out.println("Nano second: " + now.getNano());

		now = now.plusHours(2).minusMinutes(20);
		System.out.println("Hour: " + now.getHour());
		System.out.println("Minute " + now.getMinute());
		System.out.println("Second: " + now.getSecond());
		System.out.println("Nano second: " + now.getNano());
	}
}
