import java.util.*;
import java.util.concurrent.*;

public class AnyCallableTest{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		Callable<String> task1 = () -> "Task1";
		Callable<String> task2 = () -> "Task2";
		
		Collection<Callable<String>> tasks = Arrays.asList(task1, task2);
		ExecutorService executor = Executors.newCachedThreadPool();
		String result = executor.invokeAny(tasks);
		executor.shutdown();
		System.out.println(result);
		
	}
	
}