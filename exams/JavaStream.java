import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class JavaStream{
	
	public static void main(String[] args) throws IOException{
		
		IntStream
			.range(1, 10)
			.forEach(System.out::print);		
		System.out.println();
		
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));
			
		System.out.println();
		
		System.out.println(
			IntStream
				.range(1, 5)
				.sum());
				
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()	
			.findFirst()
			.ifPresent(System.out::println); 
			
		System.out.println();
			
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		Arrays.stream(names)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(x -> System.out.print(" " + x));
	}
	
}
