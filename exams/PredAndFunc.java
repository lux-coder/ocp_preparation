import java.util.function.*;

public class PredAndFunc{
	public static void main(String[] args){

		BiPredicate<String, Integer> bip = (s, i) -> s.length()>i;
		BiFunction<String, Integer, String> bif = (s, i) -> {
			if(bip.test(s, i)){
				return s.substring(0,i);
			} else return s;
		};

	String str = bif.apply("Hello world", 5);
	System.out.println(str);
	}

}