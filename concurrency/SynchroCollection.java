import java.util.concurrent.*;
import java.util.*;

public class SynchroCollection{
	
	public static void main(String[] main){
		
		List<Integer> list = Collections.synchronizedList(
			new ArrayList<>(Arrays.asList(4,3,52)));
		synchronized(list){
			for(int data: list)
				System.out.print(data + " ");
		}
		
		//it needs to be concurrentHashMap as it throws concurrentModificationException
		Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
		for(String key: synchronizedFoodData.keySet())
			synchronizedFoodData.remove(key);
		
		
	}
	
}