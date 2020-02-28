import java.util.*;

public class TestDeque {
    public static void main(String[] args) {
        Deque<Character> chars = new ArrayDeque<>();
        chars.add('A');
        chars.remove();
        //chars.remove();
 
        System.out.println(chars);
    }
}