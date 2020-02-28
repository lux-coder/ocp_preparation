import java.util.concurrent.*;
 
class Printer implements Runnable {
    public void run() {
        System.out.println("Printing");
    }
}
 
public class TestExecutor {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        /*INSERT*/
		//es.execute(new Printer());
		es.submit(new Printer());
        es.shutdown();
    }
}