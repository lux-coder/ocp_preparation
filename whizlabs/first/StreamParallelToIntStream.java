import java.util.stream.*;

public class StreamParallelToIntStream{
	
	public static void main(String[] args){
		
		Stream<String> stream = Stream.of("1","2","3","4").parallel();
								
		IntStream ins = stream.mapToInt(s -> Integer.parseInt(s));
				
		System.out.println(ins.isParallel());
		
	}
	
}