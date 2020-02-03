import java.time.*;

public class CreatingDates{
	
	public static void main(String[] args){
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 5);
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2015, 1, 5);
		
		LocalTime time1 = LocalTime.of(20,30);
		System.out.println(time1);
		LocalTime time2 = LocalTime.of(20,30,45);
		System.out.println(time2);
		LocalTime time3 = LocalTime.of(20,30,45,200);
		System.out.println(time3);
		
		LocalDateTime datetime = LocalDateTime.of(date1, time1);
		System.out.println(datetime);
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId.getAvailableZoneIds().stream()
			.filter(z -> z.contains("Zagreb"))
			.sorted().forEach(System.out::println);
			
		ZoneId zone2 = ZoneId.of("Europe/Zagreb");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(datetime, zone2);
		System.out.println(zonedDateTime);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(date2, time2, zone2);
		System.out.println(zonedDateTime2);
		
		//manipulating Dates and Times
		System.out.println("//manipulating Dates and Times");
		LocalDate date = LocalDate.of(2014, 1, 16);
		System.out.println(date);
		date = date.plusYears(5);
		System.out.println(date);
		date = date.plusDays(5);
		System.out.println(date);
		date = date.plusMonths(5);
		System.out.println(date);
		System.out.println(date.plusWeeks(5));
		//imutable
		System.out.println(date);
		
		LocalDate newDate = LocalDate.of(2020,5,5);
		LocalTime newTime = LocalTime.now();
		LocalDateTime newDateTime = LocalDateTime.of(newDate, newTime);
		System.out.println(newDateTime);
		newDateTime = newDateTime.minusMinutes(15);
		System.out.println(newDateTime);
		newDateTime = newDateTime.minusMinutes(45);
		System.out.println(newDateTime);
		
		newDateTime = newDateTime.minusMinutes(5).minusMonths(2).plusYears(5);
		System.out.println(newDateTime);
		
	}
	
}