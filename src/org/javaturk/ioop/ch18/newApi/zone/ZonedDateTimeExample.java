package org.javaturk.ioop.ch18.newApi.zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		ZonedDateTime nowInIstanbul = ZonedDateTime.now();
		System.out.printf("%-20s %-50s \n", "Now in Istanbul: ", nowInIstanbul);
		System.out.printf("%-20s %-50s \n", "Zone Id: ", nowInIstanbul.getZone());

		ZonedDateTime nowInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.printf("%-20s %-50s \n", "Now in Paris: ", nowInParis);

		ZonedDateTime nowInChicago = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		System.out.printf("%-20s %-50s \n", "Now in Chicago: ", nowInChicago);
	}
}
