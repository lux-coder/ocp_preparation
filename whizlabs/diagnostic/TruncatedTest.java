import java.time.temporal.*;
import java.time.*;

public class TruncatedTest{
	
	public static void main(String[] args){
		
		Instant now = Instant.now();
		
		System.out.println(now);
		
		now = now.truncatedTo(ChronoUnit.HOURS);
		
		System.out.println(now);
		
	}
	
}