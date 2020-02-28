import java.nio.file.*;
import java.io.*;

public class TestIoNio {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("F:\\X\\Y\\Z");
        Files.createDirectories(path);
    }
}