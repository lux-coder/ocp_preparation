import java.util.stream.*;

public class RangedStream{
	public static void main(String[] args){
		
		Object obj1 = IntStream.rangeClosed(10,15)
			.boxed()
			.filter(x -> x > 12)
			.parallel()
			.findAny();

		Object obj2 = IntStream.rangeClosed(10,15)
			.boxed()
			.filter(x -> x > 12)
			.sequential()
			.findAny();

		System.out.println(obj1 + " " + obj2);
	
}
}