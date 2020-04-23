import java.util.*;

public class WhildcardTest{
	
	public static void main(String[] args){
		
		//List<? extends Number> list = new ArrayList<>();
		List<? extends Number> list = new ArrayList<>();
		
		//list.add(new Integer(10));
		//list.add(new Integer(10));
				
		System.out.println(list.get(0) + " " + list.get(1));
		
	}
	
}