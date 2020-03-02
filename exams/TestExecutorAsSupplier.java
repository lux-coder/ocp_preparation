import java.util.concurrent.*;

public class TestExecutorAsSupplier {
    public static void main(String[] args) throws InterruptedException, 
                                                        ExecutionException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<String> f = es.execute(() -> "HELLO");
        System.out.println(f.get());
        es.shutdown();
    }
}