import java.util.*;

public class TestStreamGet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Z", "Y", "X"));
        System.out.println(list.stream().sorted().findFirst().get());
        System.out.println(list.get(2));
        System.out.println(list);
    }
}