import java.util.function.*;
import java.util.*;

public class TestBooleanBiFunction {
    public static void main(String[] args) {
        List<Boolean> list = Arrays.asList(false, new Boolean(null), new Boolean("1"), new Boolean("0"));
        BinaryOperator<Boolean> operator = (b1, b2) -> b1 || b2;
        System.out.println(list.stream().reduce(false, operator));
    }
}