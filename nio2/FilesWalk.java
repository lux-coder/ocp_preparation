import java.io.*;
import java.nio.file.*;

public class FilesWalk{
	
	public static void main(String[] args){
		
		Path path = Paths.get("..");
		
		try{
			Files.walk(path, 2)
				.filter(p -> p.toString().endsWith(".java"))
				.forEach(System.out::println);
		} catch(IOException e){
			
		}
		
	}
	
}