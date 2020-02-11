import java.util.concurrent.*;

public class LionPenManagerCyclic{
	
	private void removeAnimals(){
		System.out.println("Removing animals");
	}
	
	private void cleanPen(){
		System.out.println("Cleaning pen");
	}
	
	private void addAnimals(){
		System.out.println("Adding animals");
	}
	
	public void performTasks(CyclicBarrier c1, CyclicBarrier c2){
		
		try{
			removeAnimals();
			c1.await();
			cleanPen();
			c2.await();
			addAnimals();			
		} catch(InterruptedException | BrokenBarrierException e){
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args){
		
		ExecutorService service = null;
		
		try{
			LionPenManagerCyclic manager = new LionPenManagerCyclic();
			CyclicBarrier c1 = new CyclicBarrier(4,
				() -> System.out.println("***All animals out"));
			CyclicBarrier c2 = new CyclicBarrier(4,
				() -> System.out.println("***Pen cleaned!"));
			
			service = Executors.newFixedThreadPool(4);
			
			for(int i = 0; i < 4; i++)
				service.submit(() -> manager.performTasks(c1,c2));			
		} finally{
			if(service != null)
				service.shutdown();
		}		
	}	
}