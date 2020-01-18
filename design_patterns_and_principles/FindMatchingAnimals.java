import java.util.function.Predicate;

class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer){
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop(){return canHop;}
	public boolean canSwim(){return canSwim;}
	public String toString(){return species;}
}

/* interface CheckTrait{
	public boolean test(Animal a);
} */

public class FindMatchingAnimals{
	
	//setting functional interface of Predicate
	//private static void print(Animal animal, CheckTrait trait){
	private static void print(Animal animal, Predicate<Animal> trait){
		if(trait.test(animal))
			System.out.println(animal);
	}
	
	public static void main(String[] args){
		print(new Animal("fish", false, true), a -> a.canHop());
		print(new Animal("kangroo", true, false), a -> a.canHop());
	}
}