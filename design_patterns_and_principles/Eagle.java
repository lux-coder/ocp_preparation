interface Fly{
	public int getWingSpan() throws Exception;
	public static final int MAX_SPEED = 100;
	
	public default void land(){
		System.out.println("Animal is landing");
	}
	
	//static member is available withouth an instance
	public static double calculateSpeed(float distance, long time){
		return distance/time;
	}
}

public class Eagle{
	//does not require for Exception to be declared
	public int getWingSpan(){
		return 15;
	}
	
	//default method that has optionaly been overriden
	public void land(){
		System.out.println("Eagle is landing");
	}
}