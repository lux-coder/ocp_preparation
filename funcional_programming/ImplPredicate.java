import java.util.function.*;

public class ImplPredicate{
	
	public static void main(String[] args){
		
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(" "));
		
		BiPredicate<String, String> bp1 = String::startsWith;
		BiPredicate<String, String> bp2 = (x, y) -> x.startsWith(y);
		
		System.out.println(bp1.test("asddd", "dddd"));
		System.out.println(bp2.test("asssss", "ass"));
		
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		System.out.println(egg.test("egg"));
		System.out.println(brown.test("egg brown"));
		
		//Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
		//Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
		
		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());
		
		System.out.println(brownEggs.test("trolololo"));
		System.out.println(brownEggs.test("brown egg"));
		
		
	}
	
}