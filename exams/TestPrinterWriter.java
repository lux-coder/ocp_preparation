import java.io.PrintWriter;
 
public class TestPrinterWriter {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter(System.out)) {
            writer.println("Hello");
        } catch(Exception ex) {
            writer.close();
        }
    }
}