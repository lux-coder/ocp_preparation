import java.util.*;
import java.util.stream.*;

public class WhaleDataCalculator{
	
	public int processRecord(int input){
		
		try{
			Thread.sleep(10);			
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		return input + 1;		
	}
	
	public void processAllData(List<Integer> data){
		//data.stream().map(a -> processRecord(a)).count();
		data.parallelStream().map(a -> processRecord(a)).count();
	}
	
	public static void main(String[] args){
		
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		
		List<Integer> data = new ArrayList<Integer>();
		for(int i = 0; i<4000; i++)
			data.add(i);
		
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		double time = (System.currentTimeMillis() - start) / 1000.0;
		
		System.out.println("\nTask compleated in: " + time + "seconds");
		
	}
	
	
}