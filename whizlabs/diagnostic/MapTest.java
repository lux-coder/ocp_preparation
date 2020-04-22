import java.util.*;

public class MapTest{
	
	public static void main(String[] args){
		
		Map map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(4,"D");
		map.put(5,"E");
		map.remove("A");
		map.remove(3,"C");
		map.remove(4,"B");
		map.remove(5);
		map.values().forEach(System.out::print);
		System.out.println();
		map.keySet().forEach(System.out::print);
		
	}
	
}