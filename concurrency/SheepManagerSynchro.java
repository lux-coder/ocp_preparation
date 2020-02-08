import java.util.concurrent.*;

public class SheepManagerSynchro{
	
	private int sheepCont = 0;
	
	private void incrementAndReport(){
		synchronized(this){
			System.out.print((++sheepCont) + " ");
		}
	}
	
	public static void main(String[] args){
		
		ExecutorService service = null;
		
		try{
			
			service = Executors.newFixedThreadPool(20);
			
			SheepManagerSynchro manager = new SheepManagerSynchro();
			for(int i =0; i<10; i++){
				service.submit(() -> manager.incrementAndReport());				
			}			
		}finally{
			if(service != null){
				service.shutdown();
			}
		}
		
	}
	
}