import java.util.*;

public class TestIter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator(2);
        while(iter.hasNext()) {
            System.out.print(iter.next());
        }
    }
}