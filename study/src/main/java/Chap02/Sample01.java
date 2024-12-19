package Chap02;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Sample01 {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		LocalDateTime date2 = LocalDateTime.now(ZoneId.of("Asia/Colombo"));
		System.out.println(date2);
		System.out.println("----------------------------");
		ZoneId.getAvailableZoneIds()
			.stream()
			.forEach(System.out::println);
	}
}
