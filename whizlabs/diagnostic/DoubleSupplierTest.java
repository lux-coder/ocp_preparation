import java.util.function.*;

public class DoubleSupplierTest{
	
	public static void main(String[] args){
		
		DoubleSupplier sups = () -> Math.random()*10;
		
		//System.out.println(sups.get());
		
		System.out.println(sups.getAsDouble());
		
	}
	
}