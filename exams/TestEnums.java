enum Flags {
    TRUE, FALSE;
 
    Flags() {
        System.out.println("HELLO");
    }
}
 
public class TestEnums {
    public static void main(String[] args) {
        Flags flags = Flags.TRUE;
    }
}