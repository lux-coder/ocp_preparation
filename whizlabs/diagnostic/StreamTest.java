import java.util.stream.*;

public class StreamTest{
	
	public static void main(String[] args){
		
		Stream<String> stream = Stream.of("abc", "ab");
		System.out.println(
			stream.max((s1,s2) -> Integer.compare(s1.length(), s2.length())).get()
		);
	}	
}