import java.util.stream.*;

public class StreamConcatAndCast{
	
	public static void main(String[] args){
		
		Stream s1 = Stream.of("A", "B");
		//Stream s2 = Stream.of("1", "2");
		Stream s2 = Stream.of(1, 2);
		
		Stream out = ((Stream) Stream.concat(s1,s2).parallel()).sorted();
		
		out.forEach(System.out::print);
		
	}
	
}