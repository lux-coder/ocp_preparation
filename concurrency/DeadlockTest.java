public class DeadlockTest{
	
	private String name;
	
	public DeadlockTest(String name){
		this.name = name;
	}
	
	public synchronized void doStart(DeadlockTest test){
		System.out.printf("%s is starting \n", name);
		test.doStop();
	}
	
	public synchronized void doStop(){
		System.out.printf("%s is stopping \n", name);
	}
	
	public static void main(String[] args){
		DeadlockTest test1 = new DeadlockTest("test1");
		DeadlockTest test2 = new DeadlockTest("test2");
		
		new Thread(() -> test1.doStart(test2)).start();
		new Thread(() -> test2.doStart(test1)).start();
	}
	
}