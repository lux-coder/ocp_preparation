import java.util.*;

public class InterAndLocalization{
	
	public static void main(String[] args){
		
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		//only leanguage
		System.out.println(Locale.GERMAN);
		//leanguage and country
		System.out.println(Locale.GERMANY);
		
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hr","HR"));
		
		Locale l1 = Locale.Builder()
			.setLenguage("en")
			.setRegion("US")
			.build();
			
		Locale l2 = Locale.Builder()
			.setRegion("US")
			.setLenguage("en")
			.build();
		
	}
	
}