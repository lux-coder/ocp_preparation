import java.nio.*;
import java.nio.file.*;
import java.net.*;

public class FindingFiles{
	
	public static void main(String[] args){
		
		Path path = Paths.get(URI.create("file:///E:Photos"));
		
		System.out.println(Files.exists(path));
		
		Stream<Path> find1 = 
			Files.find(path, Integer.MAX_VALUE, (p, attr) -> true);
		
		System.out.println("count = " + find1.count());
		
		Stream<Path> find2 =
			Files.find(path, Integer.MAX_VALUE, (p, attr) -> p.toString().endsWith(".jpg"));
			
		System.out.println("count = " + find2.count());
		
		BasicFileAttribute attributes = null;
		FileTime creationTime = attributes.creationTime();
		creationTime.toMillis();
		
		Calendar c = GregorianCalendar.getInstance();
		c.set(2017, 0,1,0,0);
		long date = c.getTimeMillis();
		
		Stream<Path> find3 = 
			Files.find(path, Integer.MAX_VALUE, (p, attr) -> attr.creationTime().toMillis() < date);
		System.out.println("count = " + find3.count());
	
	}
	
}