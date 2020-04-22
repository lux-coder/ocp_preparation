import java.time.*;
import java.time.temporal.*;

public class TestChronoUnit{
	
	public static void main(String[] args){
		
		Instant now = Instant.now();
		
		now = now.truncatedTo(ChronoUnit.MONTHS);
		
		System.out.println(now);
		
	}
	
}