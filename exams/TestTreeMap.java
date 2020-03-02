import java.util.*;
 
public class TestTreeMap {
    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>(Arrays.asList("red", "green", 
                                                                 "blue", "gray"));
        System.out.println(set.ceiling("gray")); 
        System.out.println(set.floor("gray")); 
        System.out.println(set.higher("gray")); 
        System.out.println(set.lower("gray")); 
    }
}