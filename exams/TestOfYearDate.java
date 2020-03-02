import java.time.*;

public class TestOfYearDate {
    public static void main(String [] args) {
        LocalDate date = LocalDate.ofYearDay(2018, 1);
        System.out.println(date);
    }
}