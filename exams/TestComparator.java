import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 20, 8);
        
        System.out.println(list.stream().max(Comparator.comparing(a -> a)).get()); //Line 1
 
        System.out.println(list.stream().max(Integer::compareTo).get()); //Line 2
 
        System.out.println(list.stream().max(Integer::max).get()); //Line 3
    }
}