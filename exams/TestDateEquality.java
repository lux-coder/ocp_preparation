import java.time.*;

public class TestDateEquality {
    public static void main(String [] args) {
        LocalDate date1 = LocalDate.of(2019, 1, 2);
        LocalDate date3 = date1.minus(Period.ofDays(1));
        LocalDate date2 = LocalDate.of(2018, 12, 31);
        LocalDate date4 = date2.plus(Period.ofDays(1));
        System.out.println(date1.equals(date2) + ":" + date1.isEqual(date2));
        System.out.println(date3.equals(date4) + ":" + date3.isEqual(date4));
    }
}