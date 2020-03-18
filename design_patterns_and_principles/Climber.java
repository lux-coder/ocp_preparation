interface Climb{
	boolean isToHigh(int height, int limit);
}

public class Climber{
	public static void main(String[] args){
		check((h,l) -> h.toString(), 5);		
	}
	private static void check(Climb climb, int height){
		if(climb.isToHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
}