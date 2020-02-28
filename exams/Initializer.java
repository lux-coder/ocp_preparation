public class Initializer {
    static int a = 10000;
 
    static {
        --a;
    }
 
    {
        ++a;
    }
 
    public static void main(String[] args) {
        System.out.println(a);
    }
}