import java.io.*;
import java.nio.file.*;

public class TestIoNioSameFile {
    public static void main(String[] args) throws IOException{
        Path src = Paths.get("F:\\A\\B\\C\\Book.java");
        Path tgt = Paths.get("F:\\A\\B\\Book.java");
        Path copy = Files.copy(src, tgt);
        System.out.println(Files.isSameFile(src, copy));
        System.out.println(Files.isSameFile(tgt, copy));
		
    }
}