import java.util.stream.*;
import java.util.OptionalDouble;

public class TestStreams{
	
	public static void main(String[] args){
		
		IntStream range = IntStream.range(0,5);
		//OptionalDouble average = range.average();
		double average = range.average();
		System.out.println(average);
		
	}
	
}