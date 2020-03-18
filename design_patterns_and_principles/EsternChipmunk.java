interface CanClimb{
	public abstract void climb();
}
interface CanClimbTrees extends CanClimb{}
abstract class Chipmunk implements CanClimbTrees{
	public abstract void chew();
}
public class EsternChipmunk extends Chipmunk{
	public void chew(){
		System.out.println("Estern Chipmunk is chewing");
	}
	public void climb(){
		System.out.println("Estern Chipmunk is climbing");
	}
}