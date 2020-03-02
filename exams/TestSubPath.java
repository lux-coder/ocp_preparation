import java.nio.file.*;

public class TestSubPath {
    public static void main(String[] args) {
        Path path = Paths.get("F:\\A\\B\\C\\Book.java");
        System.out.println(path.subpath(1,5));
    }
}