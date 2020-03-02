import java.util.*;

public class TestIteratorBackwards {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("T", "S", "R", "I", "F");
        ListIterator<String> iter = list.listIterator(5);
        while(iter.hasPrevious()) {
            System.out.print(iter.previous());
        }
/* 		while(iter.hasNext()) {
            System.out.print(iter.next());
        } */
    }
}