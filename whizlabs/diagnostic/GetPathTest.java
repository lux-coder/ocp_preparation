import java.nio.file.*;
import java.io.*;

public class GetPathTest{
	
	public static void main(String[] args){
		
		Path path1 = Paths.get("F:\\Whizlab\\java\\NIO");
		Path paht2 = Paths.get("C:\\output");
		
		Path path = Paths.get(paht2.getRoot().toString(), path1.subpath(0,3).toString());
		
		//System.out.print(path.toString());
		System.out.print(path);
		
	}
	
}