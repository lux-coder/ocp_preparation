import java.util.function.*;

public class TestBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Character> compFunc = (i, j) -> i + j;
        System.out.println(compFunc.apply(0, 65));
    }
}