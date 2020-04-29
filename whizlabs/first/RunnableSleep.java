import java.util.concurrent.*;

class A implements Runnable{
	
	public void run(){
		try{
			for(String x: new String[]
				{"On your mark", "Get set"}){
					System.out.println(x);
					Thread.currentThread().sleep(1000);
				}
		}
		catch(InterruptedException e){
			System.out.println("Go");
		}
	}	
}

public class RunnableSleep{
	
	public static void main(String[] args){
		
		A a = new A();
		Thread t = new Thread(a);
		t.start();		
	}	
}