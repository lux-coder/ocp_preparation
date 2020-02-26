import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class BinOp{
	
	public static void main(String[] args){

		BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
		List<String> names = new ArrayList<>();
		names.add("Bill");
		names.add("George");
		names.add("Jack");
		String finalValue = names.stream().reduce("Hello: ", bo);
		System.out.println(finalValue);
	}

}