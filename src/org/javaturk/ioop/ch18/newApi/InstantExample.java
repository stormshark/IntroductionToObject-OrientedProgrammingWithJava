package org.javaturk.ioop.ch18.newApi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	public static void main(String[] args) {
		Instant timestamp = Instant.now();
		System.out.println("Now: " + timestamp);
		System.out.println("Epoch seconds: " + timestamp.getEpochSecond()); // Number of seconds from the Java epoch of 1970-01-01T00:00:00Z.
		System.out.println("Milliseconds: " + timestamp.toEpochMilli());
		System.out.println("Nanoseconds: " + timestamp.getNano());
		
		Instant laterTimestamp = timestamp.plusSeconds(1_000_000_000);
		System.out.println("\n1_000_000_000 second later: " + laterTimestamp);
		System.out.println("Is laterTimestamp after than timestamp: " + laterTimestamp.isAfter(timestamp));
		System.out.println("Is timestamp before than laterTimestamp: " + timestamp.isBefore(laterTimestamp));

		Instant beforeTimestamp = timestamp.minus(1000, ChronoUnit.DAYS);
		System.out.println("\n1000 days ago: " + beforeTimestamp);

		ZonedDateTime timeStampInChicago = timestamp.atZone(ZoneId.of("America/Chicago"));
		System.out.println("\nNow in Chicago: " + timeStampInChicago);
		
	}
}
