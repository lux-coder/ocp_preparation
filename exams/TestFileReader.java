import java.io.*;

public class TestFileReader {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:/temp.txt")) {
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}