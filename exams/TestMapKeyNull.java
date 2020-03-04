import java.util.*;

public class TestMapKeyNull {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(null, "zero");
        map.put(1, "one");
		map.put(null, "second zero");
 
        System.out.println(map);
    }
}