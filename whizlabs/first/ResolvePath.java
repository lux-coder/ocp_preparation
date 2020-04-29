import java.io.*;
import java.nio.file.*;

public class ResolvePath{
	
	public static void main(String[] args){
		
		Path path1 = Paths.get("F:\\Whizlab\\java\\NIO\\myfiles");
		Path path2 = Paths.get("myfiles\\myfile.txt");
		
		//Path path = path2.resolve(path1);
		Path path = path1.resolve(path2);
		
		System.out.print(path.toString());
		//System.out.println(path);
		
	}
	
}