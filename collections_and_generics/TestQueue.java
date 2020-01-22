import java.util.*;

public class TestQueue{
	
	public static void main(String[] args){
		
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));
		System.out.println(queue);
		System.out.println(queue.offer(4));
		System.out.println(queue);
		System.out.println(queue.add(8));
		//System.out.println(queue.push(18));
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		System.out.println("New queue");
		
		ArrayDeque<Integer> queue2 = new ArrayDeque<>();
		queue2.offer(2);
		queue2.offer(5);
		System.out.println(queue2);
		queue2.push(7);
		System.out.println(queue2);
		System.out.println(queue2.poll());
		System.out.println(queue2);
		
	}
	
}