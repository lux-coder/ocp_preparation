import java.util.*;

public class Duck implements Comparable<Duck>{
	private String name;
	private int weight;
	
	public Duck(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	 public String toString(){
		return name;
	}
	
	public String getName(){
		return name;
	}
	
	public int getWeight(){
		return weight;
	}
	
	public int compareTo(Duck d){
		return name.compareTo(d.name);
		//int can't be dereferenced
		//return weight.compareTo(d.weight);
	}
		
	public static void main(String[] args){
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack", 10));
		ducks.add(new Duck("Puddles", 18));
		System.out.println(ducks);
		
		System.out.println(ducks.get(0).compareTo(ducks.get(1)));
		
		Collections.sort(ducks);
		System.out.println(ducks);
		
		System.out.println(ducks.get(0).compareTo(ducks.get(1)));
		
/* 		Comparator<Duck> byWeight = new Comparator<Duck>(){
			public int compare(Duck d1, Duck d2){
				return d1.getWeight() - d2.getWeight();
			}
		}; 
		
		Comparator<Duck> byWeight = (Duck d1, Duck d2) -> {return d1.getWeight() - d2.getWeight();};
		
		*/
		
		Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();
		
		Collections.sort(ducks, byWeight);
		System.out.println(ducks);
		
	}
	
}