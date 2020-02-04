import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ZooOpen{
	
	public static void main (String[] args){
		
		Locale us = new Locale("en", "US");
		Locale fr = new Locale("fr", "FR");
		
		printProperties(us);
		System.out.println();
		printProperties(fr);
		System.out.println();
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k))
			.forEach(System.out::println);
			
		Properties prop = new Properties();
		rb.keySet().stream()
			.forEach(k -> prop.put(k, rb.getString(k)));
			
		System.out.println(prop);
		System.out.println(prop.getProperty("notARealProperty", "123"));
	}
	
	public static void printProperties(Locale locale){
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
	
}