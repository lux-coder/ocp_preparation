import java.util.*;

public class TestMap{
	
	public static void main(String[] args){
		
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("lion", "meet");
		map.put("girafe", "leaf");
		
		String food = map.get("koala");
		System.out.println(food);
		System.out.println();
		
		for(String str : map.keySet())
			System.out.println(str);
		
		System.out.println();
		
		for(String str : map.values())
			System.out.println(str);
		
		
		Map<String, String> map2 = new TreeMap<>();
		map2.put("koala", "bamboo");
		map2.put("lion", "meet");
		map2.put("girafe", "leaf");
		
		String food2 = map2.get("koala");
		System.out.println(food2);
		System.out.println();
		
		for(String str : map2.keySet())
			System.out.println(str);
		
		System.out.println();
		
		for(String str : map2.values())
			System.out.println(str);
		
		//containsKey();
		//containsValue();
		
	}
	
}