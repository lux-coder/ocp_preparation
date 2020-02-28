import java.util.*;

public class TestConcat {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("north", "east", "west", "south");
        list.replaceAll(s -> s.substring(0,1).toUpperCase().concat(s.substring(1)));
 
        System.out.println(list);
    }
}