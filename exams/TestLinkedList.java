import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("ONE");
        list.add("TWO");
        list.remove(2);
        System.out.println(list);
 
        Queue<String> queue = new LinkedList<>();
        queue.add("ONE");
        queue.add("TWO");
        queue.remove();
        System.out.println(queue);
    }
}