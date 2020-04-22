import java.time.*;

public class TestYear{
	
	public static void main(String[] args){
		
		LocalDate ld1 = LocalDate.of(2015,11,25);
		
		Year year = Year.of(2014);
		
		System.out.println(ld1.adjustInto(year.atDay(1)));
		
	}
	
}