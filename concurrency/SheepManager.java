import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class SheepManager{
	
	private int sheepCount = 0;
	
	//protecting data with atomic 
	private AtomicInteger sheepCount2 = new AtomicInteger(0);
	
	private void incrementAndReport(){
		System.out.print((++sheepCount) + " ");
	}
	
	private void incrementAndReportAtomic(){
		System.out.print(sheepCount2.incrementAndGet() + " ");
	}
	
	public static void main(String[] args){
		
		ExecutorService service = null;
		
		try{
			service = Executors.newFixedThreadPool(20);
			
			SheepManager manager = new SheepManager();
			SheepManager manager2 = new SheepManager();
			for(int i = 0; i<10; i++){
				service.submit(() -> manager.incrementAndReport());				
			}
			System.out.println(" ");
			for(int i = 0; i<10; i++){
				service.submit(() -> manager.incrementAndReportAtomic());
			}
			
		} finally{
			if(service != null)
				service.shutdown();
		}
		
	}
	
}