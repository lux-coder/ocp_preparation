import java.util.*;
import java.util.stream.*;

public class IndependentOperations{
	
	public static void main(String[] args){
		
		Arrays.asList("jackal", "kangaroo", "lemur")
			.stream()
			.map(s -> s.toUpperCase())
			.forEach(System.out::println);
			
		System.out.println();
			
		Arrays.asList("jackal", "kangaroo", "lemur")
			.parallelStream()
			.map(s -> {System.out.println(s); return s.toUpperCase();})
			.forEach(System.out::println);
		
	}
	
}