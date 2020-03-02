import java.util.concurrent.*;

public class TestConcurrent {
    private static void print() {
        System.out.println("PRINT");
    }
 
    private static Integer get() {
        return 10;
    }
 
    public static void main(String [] args) throws InterruptedException, 
                                                         ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<?> future1 = es.submit(TestConcurrent::print);
        Future<?> future3 = es.submit(TestConcurrent::print);
        Future<?> future4 = es.submit(TestConcurrent::print);
        Future<?> future2 = es.submit(TestConcurrent::get);
        System.out.println(future1.get());
        System.out.println(future1.get());
        System.out.println(future1.get());
        System.out.println(future2.get());
        es.shutdown();
    }
}