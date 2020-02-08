import java.util.concurrent.*;
import java.util.function.*;
import java.util.*;

public class CopyOnWriteTest{
	
	public static void main(String[] args){
		
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
		for(Integer item: list){
			System.out.print(item + " ");
			list.add(9);
		}
		
		System.out.println();
		System.out.println("Size: " + list.size());
		System.out.println();
		
		for(Integer item: list)
			System.out.print(item + " ");		
	}	
}