interface Walk{
	//compiler automatically adds public to all interface methods
	//and abstract to all non-static and non-default methods
	boolean isQuadruped();
	abstract double getMaxSpeed();
}

interface Run extends Walk{
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}

public class Lion implements Run{
	public boolean isQuadruped(){
		return true;
	}
	
	public boolean canHuntWhileRunning(){
		return true;
	}
	
	public double getMaxSpeed(){
		return 100;
	}
}