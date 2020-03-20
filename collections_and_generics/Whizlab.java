import java.util.*;
import java.util.stream.*;

public class Whizlab{
	
	public static void main(String[] args){
		
		Map<String, Integer> tmap = new TreeMap<>();
		tmap.put("ab",1);
		tmap.put("abc", 2);
		tmap.put("abcd", 3);
		tmap.replaceAll((k,v) -> (int)k.charAt(v));
		System.out.println(tmap.values());
		
		TreeMap<String, String> map = new TreeMap<>();
		map.put("a", "apple");
		map.put("e", "egg");
		map.put("g", "gear");
		SortedMap<String, String> smap = map.subMap("a", "e");
		smap.put("b", "ball");
		//smap.put("f", "fish");
		map.put("c", "cat");
		map.remove("a");
		System.out.println(smap);
		System.out.println(map);
		
		//IntStream ds = IntStream.of(1,2,2,4);
		//Stream<String> ste = ds.boxed().map(Integer::toString);
		//System.out.println(ste.distinct().findFirst());
		
		Stream<String> stream = Stream.of("A", "AB", "ABC", "ABCD", "AB");
		String out = stream.filter(s -> s.length()>2)
						.filter(s -> s.indexOf("C") > -1).findAny().orElse("None");
		System.out.println(out);
		
	}
	
}