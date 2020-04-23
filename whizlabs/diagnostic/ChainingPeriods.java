import java.time.*;

public class ChainingPeriods{
	
	public static void main(String[] args){
		
		LocalDate ld = LocalDate.of(2010,1,2);
		
		Period due = Period.ofDays(-2).plusMonths(1);
		
		ld = ld.plus(due);
		
		System.out.println(due);
		System.out.println(ld);
		
	}
	
}