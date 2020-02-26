import java.util.function.*;
import java.util.*;
import java.util.stream.*;

public class Item{
        private String name;
        private String category;
        private double price;
        
        public Item(String name, String category, double price){
            this.name = name;
            this.category = category;
            this.price = price;
        }

 	public double getPrice(){
		return price;
	}

	public String getCategory(){
		return category;
	}

	public static void main(String[] args){

		List<Item> items = Arrays.asList(
		        new Item("Pen", "Stationery", 3.0),
		        new Item("Pencil", "Stationery", 2.0),
		        new Item("Eraser", "Stationery", 1.0),
		        new Item("Milk", "Food", 2.0),
		        new Item("Eggs", "Food", 3.0)
		);
		
		ToDoubleFunction<Item> priceF = Item::getPrice;

		items.stream()
			.collect(Collectors.groupingBy(Item::getCategory))
			.forEach((a,b) -> {
				double av = b.stream().collect(Collectors.averagingDouble(priceF));
				System.out.println(a + " : " + av);
		});
	}
}