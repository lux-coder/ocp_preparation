import java.util.*;

public class TestLocale {
    public static void main(String[] args) {
        Locale locale = new Locale("temp", "UNKNOWN"); //Line 7
        System.out.println(locale.getLanguage() + ":" + locale.getCountry()); //Line 8
        System.out.println(locale); //Line 9
    }
}