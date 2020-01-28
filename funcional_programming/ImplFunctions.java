import java.util.function.*;

public class ImplFunctions{
	
	public static void main(String[] args){
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("asdasd"));
		
		
		BiFunction<String, String, String> f3 = String::concat;
		BiFunction<String, String, String> f4 = (x, y) -> x.concat(y);
		
		System.out.println(f3.apply("asd", "xcv"));
		System.out.println(f4.apply("test", "this"));
		
	}
	
}