import java.util.function.*;

public class AndThenTest{
	
	public static void main(String[] args){
		
		Function<String, Double> f = Double::parseDouble;
		
		System.out.println(f.andThen(s -> s*2).apply("1"));
		System.out.println(f.apply("1").andThen(s -> s*2));
		
	}
	
}