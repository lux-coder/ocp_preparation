import java.util.*;
import java.util.concurrent.*;

public class AllCallableTest{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<String> task1 = () -> "Task1";
		Callable<String> task2 = () -> "Task2";
		
		Collection<Callable<String>> tasks = Arrays.asList(task1, task2);
		ExecutorService executor = Executors.newCachedThreadPool();
		List<Future<String>> futures = executor.invokeAll(tasks);
		
		executor.shutdown();
		
		for(Future<String> future: futures)
			System.out.println(future.get());
		
	}
	
}