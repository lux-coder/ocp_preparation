import java.util.*;

public class SortRabbits{
	
	static class Rabbit{
		int id;
		
		Rabbit(int id){
			this.id = id;
		}
	}
	
	public static void main(String[] args){
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit(2));
		rabbits.add(new Rabbit(1));
		rabbits.add(new Rabbit(3));
		
		for(Rabbit r : rabbits)		
			System.out.println(r);
		
		//doesn't compile as Rabbit is not Comparable
		//Collections.sort(rabbits);
		
		Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
		Collections.sort(rabbits, c);
		
		rabbits.forEach(System.out::println);
		
	}
	
}