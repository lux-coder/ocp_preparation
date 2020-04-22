import java.util.*;

public class OptionalTest{
	
	public static void main(String[] args){
		
		Optional<String> ops = Optional.of("1");
		
		OptionalInt op = ops.map(Integer::parseInt);
		
		System.out.println(op);
		
	}
	
}