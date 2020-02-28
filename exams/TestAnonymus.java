public class TestAnonymus {
    public static void main(String [] args) {
        System.out.println(new Object() {
            public String toString() {
                return "Anonymous";
            }
        });
    }
}