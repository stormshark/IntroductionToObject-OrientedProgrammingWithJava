package org.javaturk.ioop.ch18.newApi.zone;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdExample {

	public static void main(String[] args) {
		ZoneId defaulZoneId = ZoneId.systemDefault();
		System.out.println("Default Zone Id: " + defaulZoneId);

		System.out.println("\n***************************************");

		listZoneIds();
	}
	
	public static void listZoneIds() {
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for(String zoneId : zoneIds)
			System.out.println("Zone Id: " + zoneId);
	}
}
