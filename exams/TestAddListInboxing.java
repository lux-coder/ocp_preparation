import java.util.*;

public class TestAddListInboxing {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add(1);
        list.add("2");
        list.forEach(System.out::print);
    }
}