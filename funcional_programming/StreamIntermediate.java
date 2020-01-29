import java.util.stream.*;
import java.util.*;

public class StreamIntermediate{
	
	public static void main(String[] args){
		
		//filter()
		System.out.println("//filter()");
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.filter(x -> x.startsWith("m")).forEach(System.out::println);
		
		//distinct()
		System.out.println("//distinct()");
		Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
		s2.distinct().forEach(System.out::println);
		
		//skip() and limit()
		System.out.println("//skip() and limit()");
		Stream<Integer> s3 = Stream.iterate(1, n -> n+1);
		s3.skip(5).limit(2).forEach(System.out::println);
		
		//map()
		System.out.println("//map()");
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		s4.map(String::length).forEach(System.out::println);
		
		//flatMap()
		System.out.println("//flatMap()");
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
		
		//sorted()
		System.out.println("//sorted()");
		Stream<String> s5 = Stream.of("brown", "bear", "blue");
		Stream<String> s6 = Stream.of("brown", "bear", "blue");
		s5.sorted().forEach(System.out::println);
		s6.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//peek()
		System.out.println("//peek()");
		Stream<String> s7 = Stream.of("black bear", "brown bear", "grizlly");
		long count = s7.filter(q -> q.startsWith("b")).peek(System.out::println).count();
		System.out.println(count);
		
		//pipeline
		System.out.println("pipeline");
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(n -> n.length() == 4)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
			
		Stream.generate(() -> "Elsa")
			.filter(n -> n.length() == 4)
			.limit(2)
			.sorted()
			.forEach(System.out::println);
			
		Stream<Integer> infinite = Stream.iterate(1, x -> x+1);
		infinite.limit(5)
			.filter(x -> x % 2 == 1)
			.forEach(System.out::print);
		
		System.out.println();
		
		Stream<Integer> infinite2 = Stream.iterate(1, x -> x+1);
		infinite2.peek(System.out::print)
			.limit(5)
			.filter(x -> x % 2 == 1)
			.forEach(System.out::print);
		
		System.out.println();
		
		Stream<Integer> infinite3 = Stream.iterate(1, x -> x + 1);
		infinite3.filter(x -> x%2 == 1)
			.limit(5)
			.forEach(System.out::print);
		
		
	}
}