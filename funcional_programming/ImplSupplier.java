import java.util.function.*;
import java.time.*;
import java.util.*;

public class ImplSupplier{
	
	public static void main(String[] args){
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		System.out.println(s1);
		System.out.println(s2);
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		Supplier<StringBuilder> st1 = StringBuilder::new;
		Supplier<StringBuilder> st2 = () -> new StringBuilder();
		
		Supplier<ArrayList<String>> als = ArrayList<String>::new;
		ArrayList<String> al = als.get();
		
		System.out.println(als);
		System.out.println(al);
		
	}
	
}