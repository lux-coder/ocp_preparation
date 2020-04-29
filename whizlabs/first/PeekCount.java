import java.util.stream.*;

public class PeekCount{
	
	public static void main(String[] args){
		
		Stream str = Stream.of("1","2","3");
		//System.out.println(str.peek(s -> System.out.print(s)).count());
		System.out.println(str.peek(System.out::print).count());
		
	}
	
}