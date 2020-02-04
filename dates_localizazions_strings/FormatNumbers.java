import java.util.*;
import java.text.*;
import java.time.format.*;
import java.time.*;

public class FormatNumbers{
	
	public static void main(String[] args){
		
		int attendeesPerYear = 3_200_200;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));
		
		Locale locale = new Locale("hr", "HR");
		Locale.setDefault(locale);
		double price = 48;
		NumberFormat cro = NumberFormat.getCurrencyInstance();
		System.out.println(cro.format(price));
		
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45";		
		try{
			System.out.println(en.parse(s));
			System.out.println(fr.parse(s));				
		} catch(Exception e){
			e.printStackTrace();
		}
		
		//formating dates
		System.out.println("//formating dates");
		LocalDate date = LocalDate.of(2020,2,20);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear());
		
		LocalDate date2 = LocalDate.now();
		LocalTime time2 = LocalTime.now();		
		LocalDateTime dateTime = LocalDateTime.of(date2, time2);
		System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time2.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(date2));
		System.out.println(shortDateTime.format(dateTime));
		//unsupportedTemporalType exception
		//System.out.println(shortDateTime.format(time2));
		
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		//System.out.println(mediumDateTime.format(date2));
		System.out.println(mediumDateTime.format(dateTime));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}