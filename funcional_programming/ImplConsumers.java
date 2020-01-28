import java.util.function.*;
import java.util.*;

public class ImplConsumers{
	
	public static void main(String[] args){
		
		Consumer<String> c1 = System.out::println;
		Consumer<Integer> c2 = x -> System.out.println(x*2);
		
		//can't get as it's consumer
		//String s1 = c1.get();
		
		//it prints as it described in definition of consumer c1
		c1.accept("test");
		c2.accept(2);		
		
		Map<String, Integer> map = new HashMap();
		BiConsumer<String, Integer> bc1 = map::put;
		BiConsumer<String, Integer> bc2 = (k, v) -> map.put(k,v);
		
		bc1.accept("chicken", 5);
		bc2.accept("chick", 10);
		
		System.out.println(map);
		
		Map<String, String> mapa = new HashMap();
		BiConsumer<String, String> bi1 = mapa::put;
		BiConsumer<String, String> bi2 = (k, v) -> mapa.put(k, v.toUpperCase());
		
		bi1.accept("first", "consumer");
		bi2.accept("second", "consic");
		
		System.out.println(mapa);
		
	}
	
}