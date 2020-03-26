import java.util.*;
import java.util.stream.*;

public class Whizlab{
	
	public static void main(String[] args){
		List<String> list = Arrays.asList("1Z0-809", "1Z0-810", "1Z1-811", "1Z0-803");
		List<String> list2 = list.stream().flatMap(e -> Stream.of(e.split("-")))
						.distinct().sorted().collect(Collectors.toList());
		System.out.println(list2);
		
		Stream<Double> stream = Stream.of(2.2,2.8,2.5);
		//Stream<Integer> out = stream.mapToInt(Double::intValue);
		Stream<Integer> out = stream.map(Double::intValue);
		//IntStream out = stream.mapToInt(Double::intValue);
		System.out.println(out.distinct().count());
		
		IntStream ints = IntStream.of(3,2,1,5,3,4,5);
		System.out.println(ints.filter(e -> e>3).distinct().average().getAsDouble());
		
		Stream str = Stream.of(10,20,"30");
		boolean b = str.allMatch(in -> in instanceof Number);		
		System.out.println(b);
		
		Stream<String> strstr = Stream.of("10","20","30");
		//Optional<String> o = strstr.anyMatch(s -> s.length() > 2);		
		//System.out.println(o);
		
		Optional<String> opt = Optional.empty();
		System.out.println(opt);
		
		Stream<Integer> s = Stream.of(12,40,11,22);
		//Optional<Integer> min = s.filter((Integer p) -> p%2 == 0 ).min();
		//Optional<Long> min = s.filter((Integer p) -> p%2 == 0 ).count();
		//System.out.println(min);
		
	}
	
}