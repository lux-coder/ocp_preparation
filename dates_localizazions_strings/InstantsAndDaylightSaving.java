import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantsAndDaylightSaving{
	
	public static void main(String[] args){
		
	/* 	Instant now = Instant.now();
		System.out.println(now);
		
		LocalDate date = LocalDate.of(2015,5,25);
		LocalTime time = LocalTime.of(11,55,00);
		
		ZoneId zone = ZoneId.of("Europe/Zagreb");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(zonedDateTime);
		Instant instant = zonedDateTime.toInstant();
		System.out.println(instant);
		
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour);
		//Instant nextMonth = instant.plus(1, ChronoUnit.MONTHS);
		//Cant do operation on instant with month or year
		//System.out.println(nextMonth);
		
		 */
		
		LocalDate date2 = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time2 = LocalTime.of(1, 30);
		ZoneId zoneUS = ZoneId.of("US/Eastern");
		ZoneId zoneEU = ZoneId.of("Europe/Berlin");
		ZonedDateTime zonedDateTimeUS = ZonedDateTime.of(date2, time2, zoneUS);
		ZonedDateTime zonedDateTimeEU = ZonedDateTime.of(date2, time2, zoneEU);
		
		System.out.println(zonedDateTimeUS);
		System.out.println(zonedDateTimeEU);
		
		zonedDateTimeUS = zonedDateTimeUS.plusHours(1);
		zonedDateTimeEU = zonedDateTimeEU.plusHours(1);

		System.out.println(zonedDateTimeUS);
		System.out.println(zonedDateTimeEU);
		
		System.out.println();
		LocalDate date3 = LocalDate.of(2016, Month.NOVEMBER, 6);
		LocalTime time3 = LocalTime.of(1,30);
		ZonedDateTime zonedDateTimeUS2 = ZonedDateTime.of(date3, time3, zoneUS);
		ZonedDateTime zonedDateTimeEU2 = ZonedDateTime.of(date3, time3, zoneEU);
		
		System.out.println(zonedDateTimeUS2);
		System.out.println(zonedDateTimeEU2);
		
		zonedDateTimeUS2 = zonedDateTimeUS2.plusHours(1);
		zonedDateTimeEU2 = zonedDateTimeEU2.plusHours(1);
		
		System.out.println(zonedDateTimeUS2);
		System.out.println(zonedDateTimeEU2);		
		
		zonedDateTimeUS2 = zonedDateTimeUS2.plusHours(1);
		zonedDateTimeEU2 = zonedDateTimeEU2.plusHours(1);
		
		System.out.println(zonedDateTimeUS2);
		System.out.println(zonedDateTimeEU2);
		
		
		
		
	}
	
}