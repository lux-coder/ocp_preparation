import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
 
        List<? extends Object> list2 = list1;
        list2.remove("A"); //Line 13
        //list2.add("C"); //Line 14
 
        System.out.println(list2);
        System.out.println(list1);
    }
}