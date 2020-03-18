import java.util.*;

public class Hello<T>{
	T t;
	public Hello(T t){
		this.t = t;
	}
	public String toString(){
		return t.toString();
	}
	public static void main(String[] args){
		System.out.print(new Hello<String>("hi"));
		System.out.print(new Hello<String>("there"));
		
		System.out.println();
		
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		//numbers.add(86);
		numbers.add(null);
		numbers.add(309L);
		Iterator iter = numbers.iterator();
		while(iter.hasNext())
			System.out.print(iter.next());
		
		System.out.println();
		
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		System.out.println(tree.ceiling("On"));
		
		System.out.println();
		
		Map m = new HashMap();
		m.put(123, "456");
		System.out.println(m.contains(123));
	}
}