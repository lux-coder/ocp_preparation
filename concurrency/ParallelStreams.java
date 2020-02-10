import java.util.concurrent.*;
import java.util.stream.*;
import java.util.*;

public class ParallelStreams{
	
	public static void main(String[] args){
		
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6,7,8).stream();
		Stream<Integer> streamParallel = stream.parallel();
		
		//stream.forEach(System.out::print);		
		streamParallel.forEach(System.out::print);
		
		System.out.println();
		
		Stream<Integer> parallelStream = Arrays.asList(1,2,3,4,5,6,7,8).parallelStream();
		parallelStream.forEachOrdered(System.out::print);
		
		
	}
	
}