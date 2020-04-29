import java.util.stream.*;

public class AveragingIntFromString{
	
	public static void main(String[] args){
		
		Stream<String> stream = Stream.of("12","13","3","1");
				
		double avg = stream.collect(Collectors.averagingInt(s -> Integer.parseInt(s)));
				
		System.out.println(avg);
		
	}
	
}