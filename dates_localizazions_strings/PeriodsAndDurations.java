import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodsAndDurations{
	
	public static void main(String[] args){
		
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		performAnimalEnrichment(start, end);
		
		Period period = Period.ofMonths(1);
		performAnimalEnrichmentWithPeriod(start, end, period);
		
		Period annually = Period.ofYears(1);
		System.out.println(annually);
		Period quaterly = Period.ofMonths(3);
		System.out.println(quaterly);
		//method signature is with ints, not Periods
		//System.out.println(Period.of(annually, quaterly));
		System.out.println(Period.of(1,2,3));
		
		Duration daily = Duration.ofDays(1);
		System.out.println(daily);
		Duration hourly = Duration.ofHours(3);
		System.out.println(hourly);
		Duration everyMinute = Duration.ofMinutes(15);
		System.out.println(everyMinute);
		
		System.out.println("//chronoUnits");
		Duration dailyChrono = Duration.of(1, ChronoUnit.DAYS);	
		System.out.println(dailyChrono);
		Duration minuteChrono = Duration.of(15, ChronoUnit.MINUTES);
		System.out.println(minuteChrono);
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);		
		dateTime = dateTime.plus(daily);
		System.out.println(dateTime);
		dateTime = dateTime.plus(minuteChrono);
		System.out.println(dateTime);
		Duration ofHours2 = Duration.ofHours(23);
		dateTime = dateTime.plus(ofHours2);
		System.out.println(dateTime);
		
		
	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end){
		LocalDate upTo = start;
		while(upTo.isBefore(end)){
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1);			
		}
		System.out.println(upTo);
	}
	
	private static void performAnimalEnrichmentWithPeriod(LocalDate start, LocalDate end, Period period){
		LocalDate upTo = start;
		while(upTo.isBefore(end)){
			System.out.println("give pew toy: " + upTo);
			upTo = upTo.plus(period);
		}
		System.out.println(upTo);
	}
	
}