import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;


public class StatefulOperations{
	
	public static void main(String[] args){
		
		List<Integer> data = Collections.synchronizedList(new ArrayList<>());
		Arrays.asList(1,2,3,4,5,6).parallelStream()
			.map(i -> {data.add(i); return i;}) //avoid stateful lambdas
			//result is printed ordered only because of forEach
			.forEachOrdered(i -> System.out.print(i + " "));
		
		System.out.println();
		//results are saved totaly randomed
		for(Integer e: data){
			System.out.print(e+" ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.asList('w','o','l','f')
			.stream()
			.reduce("", (c,s1) -> c + s1,
				(s2,s3) -> s2 + s3));
		
		System.out.println(Arrays.asList(1,2,3,4,5,6)
			.parallelStream()
			.reduce(0, (a,b) -> (a-b))); //accumulator not associative
			
		System.out.println(Arrays.asList("w","o","l","f")
			.parallelStream()
			.reduce("X", String::concat));
			
		Stream<String> stream = Stream.of("w","o","l","f").parallel();
		SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);
		System.out.println(set);
		
		Stream<String> ohmy = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, String> map = ohmy
			.collect(Collectors.toConcurrentMap(String::length, k -> k,
			(s1,s2) -> s1 + "," + s2));
		System.out.println(map);
		System.out.println(map.getClass());
		
		Stream<String> ohmy2 = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, List<String>> map2 = ohmy2.collect(
			Collectors.groupingByConcurrent(String::length));
		System.out.println(map2);
		System.out.println(map2.getClass());
	}
	
}