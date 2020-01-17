public class IsItFurry{
	
	static interface Mammal {}
	static class Furry implements Mammal {}
	static class Chipmunk extends Furry {}
	
	public static void main(String[] args){
		Chipmunk c = new Chipmunk();
		
		Mammal m = c;
		Furry f = c;
		
		int result = 0;
		
		if (c instanceof Mammal) result += 1;
		if (c instanceof Furry) result += 2;
		if (null instanceof Mammal) result += 4;
		
		if (m instanceof Mammal) result += 1;
		if (f instanceof Furry) result += 2;
		
		
		if (f instanceof Mammal) result += 1;
		if (m instanceof Furry) result += 2;
		
		Mammal m2 = new Mammal();
		
		
		
		System.out.println(result);
		
	}
}