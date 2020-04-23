import java.util.function.*;
import java.util.*;

public class ToDoubleBiTest{
	
	public static void main(String[] args){
		
		Map<Integer, Double> map = new HashMap<>();
		
		map.put(1, 1.1);
		map.put(2, 2.2);
		map.put(1, 3.3);
		
		//ToDoubleBiFunction<Double, Integer> tdbf = (a,b) -> a+b;
		ToDoubleBiFunction<Integer, Double> tdbf = (a,b) -> a+b;
		
		//map.forEach((k,v) -> System.out.println(tdbf.applyAsDouble(v,k)));
		map.forEach((k,v) -> System.out.println(tdbf.applyAsDouble(k,v)));
		
	}
	
}