import java.util.stream.*;

public class TestReduce{
	
	public static void main(String[] args){
		
		String str1 = Stream.iterate(1, i -> i + 1).limit(10)
						.reduce("", (i, s) -> i + s, (s1, s2) -> s1 + s2);
		String str2 = Stream.iterate(1, i -> i + 1).parallel().limit(10)
						.reduce("", (i, s) -> i + s, (s1, s2) -> s1 +s2);
						
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		
	}
	
}