import java.util.*;
import java.util.function.*;

public class ConsPred{
	
	public static void main(String[] args){
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(7);
		numbers.add(4);
		numbers.add(3);
		numbers.add(5);
		
		Predicate<Integer> pred = p -> p>4;
		Consumer<Integer> cons = System.out::print;
		
		numbers.stream().filter(pred.negate()).forEach(cons);
		
	}
	
}