import java.util.stream.*;

public class TestEmptyStreamReverse {
    public static void main(String[] args) {
        Stream<StringBuilder> stream = Stream.of();
        stream.map(s -> s.reverse()).forEach(System.out::println);
    }
}