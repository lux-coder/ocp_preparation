import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class StreamTesting{
	
	public static void main(String[] args){
		
		
		Stream<String> empty = Stream.empty();
		Stream<Integer> one = Stream.of(1);
		Stream<Integer> few = Stream.of(1,2,3,4);
		
		//int count = 0;
		//few.forEach(count++);
		//System.out.println(count);
		
		System.out.println(few.count());
		
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> fromList = list.stream();
		
		Stream<Double> randoms = Stream.generate(Math::random);
		//prints infinite stream of randoms
		//randoms.forEach(System.out::println);
		
		System.out.println("//optional, min, max");
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);
		
		Optional<?> minEmpty = Stream.empty().min((s1,s2) -> 0);
		System.out.println(minEmpty.isPresent());
		
		
		//these return optional
		System.out.println("//infinite stream, findAny");
		Stream<String> s3 = Stream.of("asdd", "dsafasfda", "asdasdads");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		
		s3.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);
		
		
		//these return boolean
		System.out.println("//allMatch(), anyMatch(), noneMatch()");
		List<String> list2 = Arrays.asList("asdad","2","asdqwe");
		Stream<String> infinte2 = Stream.generate(() -> "qweasd");
		
		Predicate<String> predicate = x -> Character.isLetter(x.charAt(0));
		
		System.out.println(list2.stream().anyMatch(predicate));
		System.out.println(list2.stream().allMatch(predicate));
		System.out.println(list2.stream().noneMatch(predicate));
		
		System.out.println("//reduce");
		Stream<String> stream = Stream.of("w","o","l","f");
		//String word = stream.reduce("", (st,c) -> st + c);
		String word = stream.reduce("", String::concat);
		System.out.println(word);
		
		Stream<Integer> streamInt = Stream.of(1,2,3,4,5);
		Stream<Integer> streamInt2 = Stream.of(1,2,3,4,5);
		System.out.println(streamInt.reduce(1, (a,b) -> a*b));
		//if no identity than optional is returned
		System.out.println(streamInt2.reduce((a1,b1) -> a1*b1));
		
		
		System.out.println("//collect");
		Stream<String> stream2 = Stream.of("w","o","l","f");
		Stream<String> stream3 = Stream.of("w","o","l","f");
		Stream<String> stream4 = Stream.of("w","o","l","f");
		Stream<String> stream5 = Stream.of("w","o","l","f");
		StringBuilder wordSB = stream2.collect(StringBuilder::new, StringBuilder::append, 
											StringBuilder::append);
		System.out.println(wordSB);
		TreeSet<String> set = stream3.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);
		TreeSet<String> treeSet = stream4.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(treeSet);
		Set<String> set2 = stream5.collect(Collectors.toSet());
		System.out.println(set2);
	}
	
}












