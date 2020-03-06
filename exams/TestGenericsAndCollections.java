import java.util.*;
import java.util.stream.*;

public class TestGenericsAndCollections{
	
	public static void main(String[] args){
		
		String[] cities = {"Seul", "Tokyo", "Paris", "London", "Hong Kong", "Singapure"};
		
		Arrays.stream(cities).sorted((s1, s2) -> s2.compareTo(s1))
				.forEach(System.out::println);
				
		List<? super String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		//it has to be Object as it's super type of String
		//for(String str: list){
		for(Object str: list){
			System.out.println(str);
		}
		
		IntStream stream = "OCP".chars();
		stream.forEach(c -> System.out.print((char)c));
		
		System.out.println();
		
		String[] arr = {"A5", "B4", "C3", "D2", "E1"};
		Arrays.sort(arr, Comparator.comparing(s -> s.substring(1)));
		for(String str: arr){
			System.out.println(str + " ");
		}
		
		List<String> list2 = new LinkedList<>();
		list2.add("ONE");
		list2.add("TWO");
		list2.remove(1);
		System.out.println(list2);
		
		Queue<String> queue = new LinkedList<>();
		queue.add("ONE");
		queue.add("TWO");
		queue.remove();
		System.out.println(queue);
		
		
		List<String> list3 = Arrays.asList("oca", "ocp", null, "null", "java", null);
		System.out.println(list3.size());
		System.out.println(list3);
		
		
		List<String> colors = new ArrayList<>();
		colors.add("RED");
		colors.add("GREEN");
		colors.add("BLUE");
		Iterator<String> iter = colors.iterator();
		while(iter.hasNext()){
			iter.next();
			iter.remove();
		}
		System.out.println(colors.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}