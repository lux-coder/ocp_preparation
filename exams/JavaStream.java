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
			
		System.out.println();
		
		Arrays.stream(new int[]{2,4,6,8,10})
			.map(x -> x * x)
			.average()
			.ifPresent(System.out::print);
			
		System.out.println();
		
		String[] people= {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
		Arrays.stream(people)
			.map(String::toLowerCase)
			.filter(x -> x.startsWith("a"))
			.forEach(System.out::println);
			
		System.out.println();
		
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands
			.sorted()
			.filter(x -> x.length() > 13)
			.forEach(System.out::println);
		bands.close();
		
		System.out.println();
		
		List<String> bands2 = Files.lines(Paths.get("bands.txt"))
			.filter(x -> x.contains("jit"))
			.collect(Collectors.toList());
		bands2.forEach(System.out::print);
		
		System.out.println();
		System.out.println();
		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.count();
		System.out.println("rowCount: " + rowCount);
		rows.close();
		
		System.out.println();
		
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		rows2
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		rows2.close();
		
		System.out.println();

		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.filter(x -> Integer.parseInt(x[1]) > 15)
			.collect(Collectors.toMap(
				x -> x[0],
				x -> Integer.parseInt(x[1])));
		rows3.close();
		for(String key : map.keySet()){
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println();
		
		double total = Stream.of(1.3, 1.44, 8.5)
			.reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total: " + total);
		
		System.out.println();	
		
		IntSummaryStatistics statistics = IntStream.of(7,2,5,98,321,11,654654)
			.summaryStatistics();
		System.out.println(statistics);
		
	}	
}
