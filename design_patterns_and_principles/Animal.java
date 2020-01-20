//immutable object pattern

import java.util.*;

public final class Animal{
	private final List<String> favoriteFoods;
	private final int age;
	private final String species;
	
	public Animal(String species, int age, List<String> favoriteFoods){
		this.species = species;
		this.age = age;
		if(favoriteFoods == null){
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public String getSpicies(){
		return species;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getFavoriteFoodsCount(){
		return favoriteFoods.size();
	}
	
	public String getFavoriteFood(int index){
		return favoriteFoods.get(index);
	}
	
	/* public Animal(List<String> favoriteFoods) {
		if(favoriteFoods == null)
			throw new RuntimeException("favoriteFoods is required");
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	//this makes class mutable
	public List<String> getFavoriteFoods(){
		return favoriteFoods;
	} */
}