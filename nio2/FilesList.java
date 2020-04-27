import java.io.*;
import java.nio.file.*;

public class FilesList{
	
	public static void main(String[] args){
		
		Path path = Paths.get(".");
		
		try{
			Files.list(path)
				.filter(p -> !Files.isDirectory(p))
				.map(p -> p.toAbsolutePath())
				.map(p -> p.normalize())
				.forEach(System.out::println);			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}