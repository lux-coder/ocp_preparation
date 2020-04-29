import java.util.*;

class Dog{
	
	String name, owner;
	int age;
	
	Dog(String n, String o, int a){
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	
	public String toString(){
		return owner;
	}	
}

public class ComparatorTest{
	
	public static void main(String[] args){
		
		ArrayList<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("Lazy", "John", 3));
		dogList.add(new Dog("White", "Henry", 2));
		dogList.add(new Dog("Blanky", "Bert", 5));
		dogList.add(new Dog("Tazan", "Jack", 1));
		
		Sort1 s1 = new Sort1();
		Collections.sort(dogList, s1);
		System.out.print(dogList);
		
		Sort2 s2 = new Sort2();
		Collections.sort(dogList, s2);
		System.out.print(dogList);
		
	}
	
	static class Sort1 implements Comparator<Dog>{
		public int compare(Dog first, Dog second){
			return first.name.compareTo(second.name);
		}
	}
	
	static class Sort2 implements Comparator<Dog>{
		public int compare(Dog first, Dog second){
			return first.owner.compareTo(second.owner);
		}
	}
	
}