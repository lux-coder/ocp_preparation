public class TestGenerics<T> {
    private T t;
 
    public T get() {
        return t;
    }
 
    public void set(T t) {
        this.t = t;
    }
 
    public static void main(String args[]) {
        TestGenerics obj = new TestGenerics();
        obj.set("OCP");
        obj.set(85);
        obj.set('%');
 
        System.out.println(obj.get());
    }
}