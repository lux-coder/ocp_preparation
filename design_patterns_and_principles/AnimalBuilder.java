//builder pattern
import java.util.*;

class Animal{
	private int age;
	private String species;	
	private List<String> favoriteFoods;
}

public class AnimalBuilder{
	private int age;
	private String species;	
	private List<String> favoriteFoods;
	
	public AnimalBuilder setAge(int age){
		this.age = age;
		return this;
	}
	
	public AnimalBuilder setSpicies(String species){
		this.species = species;
		return this;
	}
	
	public AnimalBuilder setFavoritesFood(List<String> favoriteFoods){
		this.favoriteFoods = favoriteFoods;
		return this;
	}
	
	public Animal build(){
		return new Animal(age,species,favoriteFoods);
	}

	public static void main(String[] args){
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder.setAge(4)
		.setFavoritesFood(Arrays.asList("grass", "fish"))
		.setSpicies("duck");
		Animal duck = duckBuilder.build();
		
		Animal flamingo = new AnimalBuilder()
			.setFavoritesFood(Arrays.asList("algee", "insects"))
			.setSpicies("flamingo").build();
	}
	
}