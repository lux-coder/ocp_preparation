import java.time.*;
import java.util.stream.*;
import java.util.function.*;
import java.nio.file.*;
import java.io.*;

public class Again{
	public static void main(String[] args){
		
		String p = Period.ofDays(1).toString();
		String d = Duration.ofDays(1).toString();
		
		System.out.println(p);
		System.out.println(d);
		
		boolean b1 = d == p;
		boolean b2 = d.equals(p);
		
		System.out.println(b1 + " " + b2);
		
		Stream<LocalDate> s = Stream.of(LocalDate.now());
		UnaryOperator<LocalDate> u = l -> l;
		s.filter(l -> l != null).map(u).peek(System.out::println).count();
		
		Path path = Paths.get("/bats/night", "..").resolve(Paths.get("./sleep.txt"));
		System.out.println(path);
	}
}