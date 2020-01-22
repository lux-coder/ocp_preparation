public interface Shippable<T>{
	void ship(T t);
}

//specify generic type in the class
public class ShippableRobotCrate implements Shippable<Robot>{
	public void ship(Robot t){}
}

//create generic class
public class ShippableRobotCrate<U> implements Shippable<U>{
	public void ship(U t){}
}

//not using generics
class ShippableRobotCrate implements Shippable{
	public void ship(Object t){}
}

public static <T> Crate<T> ship(T t){
	System.out.println("Prepaaring " + t);
	return new Crate<T>();
}

//formal parametar type immediately before return type
public static <T> void sink(T t){}

//return type being formal parametar type
public static <T> T identity(T t) {return t;}