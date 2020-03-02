import java.util.*;

public class TestScanner {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            String s = scan.nextLine();
            System.out.println(s);
            scan = null;
        }
    }
}