import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

public class FilesFindStream{
	
	public static void main(String[] args){
		
		Path path = Paths.get(".");
		long dateFilter = 1420070400000l;
		
		try{
			
			Stream<Path> stream = Files.find( path, 10,
				(p,a) -> p.toString().endsWith(".java")
				&& a.lastModifiedTime().toMillis()>dateFilter);
			
			stream.forEach(System.out::println);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}