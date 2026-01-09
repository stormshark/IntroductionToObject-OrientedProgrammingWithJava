package org.javaturk.ioop.ch18.newApi.zone;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZoneOffsetExample {

	public static void main(String[] args) {
		OffsetDateTime nowInIstanbul = OffsetDateTime.now();
		System.out.println("Now in Istanbul: " + nowInIstanbul);
		
		ZoneOffset istanbulOffset = nowInIstanbul.getOffset();
		System.out.println("Offset of Istanbul: " + istanbulOffset);

		OffsetDateTime nowInNewYork = OffsetDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("\nNow in NewYork: " + nowInNewYork);

		ZoneOffset newYorkOffset = nowInNewYork.getOffset();
		System.out.println("Offset of NewYork: " + newYorkOffset);
	}
}
