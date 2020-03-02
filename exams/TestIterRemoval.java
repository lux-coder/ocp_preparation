import java.util.*;

public class TestIterRemoval {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        Iterator<String> iter = colors.iterator();
        while(iter.hasNext()) {
            iter.remove();
            //iter.next();
        }
        System.out.println(colors.size());
    }
}