import java.util.Locale;

public class TestLocaleCountryDouble {
    public static void main(String[] args) {
        Locale loc = Locale.ENGLISH;
        loc.setCountry("en");
        loc.setCountry("CA");
 
        System.out.println(loc.getDisplayCountry());
    }
}