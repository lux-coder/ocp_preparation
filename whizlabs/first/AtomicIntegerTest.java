import java.util.concurrent.atomic.*;

public class AtomicIntegerTest{
	
	int val = 10;
	int x;
	
	AtomicIntegerTest(int i){
		val = i;
	}
	
	private AtomicInteger value = new AtomicInteger(val);
	
	public static void main(String[] args){
		
		AtomicIntegerTest ait = new AtomicIntegerTest(5);
		
		System.out.println(ait.value.decrementAndGet());
		//System.out.println(ait.decrementAndGet());
	}	
}