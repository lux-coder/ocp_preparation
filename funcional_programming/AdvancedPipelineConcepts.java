import java.util.*;
import java.lang.*;
import java.util.Optional;
import java.util.stream.*;
import java.util.function.*;

public class AdvancedPipelineConcepts{
	
	public static void main(String[] args){
		
		Optional<Integer> opt = Optional.of(1234);
		threeDigit(opt);
		
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy3 = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy4 = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy5 = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy6 = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy7 = Stream.of("lions", "tigers", "bears");
		Stream<String> ohMy8 = Stream.of("lions", "tigers", "bears");
		String result = ohMy.collect(Collectors.joining(", "));
		System.out.println(result);
		
		Double result1 = ohMy1.collect(Collectors.averagingInt(String::length));
		System.out.println(result1);
		
		Map<String, Integer> map = ohMy2.collect(
			Collectors.toMap(s -> s, String::length));
		System.out.println(map);
		
		Map<Integer, String> map1 = ohMy3.collect(Collectors.toMap(
			String::length, k -> k, (s1,s2) -> s1 + "," + s2));
		System.out.println(map1);
		System.out.println(map1.getClass());
		
		Map<Integer, String> map2 = ohMy4.collect(Collectors.toMap(
			String::length, i -> i, (q1, q2) -> q1 + "," + q2, TreeMap::new));
		System.out.println(map2);
		System.out.println(map2.getClass());
		
		Map<Integer, List<String>> map3 = ohMy5.collect(Collectors.groupingBy(
			String::length));
		System.out.println(map3);
		System.out.println(map3.getClass());
		
		TreeMap<Integer, Set<String>> map4 = ohMy6.collect(Collectors.groupingBy(
			String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(map4);
		System.out.println(map4.getClass());
		
		Map<Boolean, List<String>> map5 = ohMy7.collect(Collectors.partitioningBy(
			s -> s.length() <= 5));
		System.out.println(map5);
		System.out.println(map5.getClass());
		
		Map<Integer, Optional<Character>> map6 = ohMy8.collect(
			//Collectors.groupingBy(
			groupingBy(
				w -> w.length(), 
				mapping(c -> c.charAt(0),
				
				//some wierd Java bug, check at https://coderanch.com/t/661352/certification/min-doesn-compile-Sybex
				
					minBy(Comparator.naturalOrder()))));
		System.out.println(map6);
		
	}
	
	private static void threeDigit(Optional<Integer> optional){
		optional.map(n -> "" + n)
			.filter(s -> s.length() == 3)
			.ifPresent(System.out::println);
	}
	
}