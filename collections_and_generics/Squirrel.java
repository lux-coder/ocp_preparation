import java.util.*;

public class Squirrel {
	
	private int weight;
	private String spicies;
	
	public Squirrel(String theSpicies, int weight){
		if(theSpicies == null) throw new IllegalArgumentException();
		spicies = theSpicies;		
		this.weight = weight;
	}
	
	public int getWeight(){
		return weight;
	}
	public void setWeight(int weight){
		this.weight = weight;		
	}
	
	public String getSpicies(){
		return spicies;
	}
	
	public static void main(String[] args){
		
		Squirrel s1 = new Squirrel("s1", 26);
		Squirrel s2 = new Squirrel("s1", 24);
		
		Comparator<Squirrel> multiFieldComparator = new Comparator<Squirrel>(){
			public int compare(Squirrel s1, Squirrel s2){
				int result = s1.getSpicies().compareTo(s2.getSpicies());
				if(result != 0)
					return result;
				return s1.getWeight() - s2.getWeight();
			}
		};
		
		Comparator<Squirrel> chainingComparator = new Comparator<Squirrel>(){
			public int compare(Squirrel s1, Squirrel s2){
				Comparator<Squirrel> c = Comparator.comparing(s -> getSpicies());
				c = c.thenComparing(s -> s.getWeight());
				return c.compare(s1, s2);
			}
		};
		
		System.out.println(multiFieldComparator.compare(s1, s2));
		
		System.out.println(chainingComparator.compare(s1, s2));
		
		
	}	
}

/* 
class MultiFieldComparator implements Comparator<Squirrel>{
	public static int compare(Squirrel s1, Squirrel s2){
		int result = s1.getSpicies().compareTo(s2.getSpicies());
		if(result != 0)
			return result;
		return s1.getWeight() - s2.getWeight();
	}
} 

class ChainingComparator implements Comparator<Squirrel>{
	public int compare(Squirrel s1, Squirrel s2){
		Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpicies());
		c = c.thenComparingInt(s -> s.getWeight());
		return c.compare(s1, s2);
	}
}
*/






















