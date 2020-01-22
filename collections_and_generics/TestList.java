import java.util.*;

public class TestList{
	
	public static void main(String[] args){
		
		List<String> list = new ArrayList<>();
		System.out.println(list);
		list.add("SD");
		System.out.println(list);
		list.add(0,"NY");
		System.out.println(list);
		list.set(1,"FL");
		System.out.println(list);
		list.remove("NY");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
		list.add("OH");
		list.add("CO");
		list.add("NJ");
		//list.add("NJ", "FRnj");
		System.out.println(list);
		String state = list.get(0);
		System.out.println(state);
		int index = list.indexOf("NJ");
		System.out.println(index);
		
		for(String str : list){
			System.out.println(str);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			String str = iter.next();
			System.out.println(str);
		}
		
	}
}