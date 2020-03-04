import java.time.*;

public class TestTimeDuration {
    public static void main(String [] args) {
        LocalTime t1 = LocalTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        System.out.println(Duration.between(t1, t2));
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		//System.out.println(Period.between(d1,d2));
		//System.out.println(Duration.between(d2,d1));
    }
}