import java.nio.file.*;
import java.io.*;
import java.util.*;

public class PathFilePathTest{
	
	public static void printPathInformation(Path path){
		
		System.out.println("Filename is: " +path.getFileName());
		System.out.println("Root is: " +path.getRoot());
		
		Path currentParent = path;
		while((currentParent = currentParent.getParent()) != null){
			System.out.println(" Current partent is: " + currentParent);
		}		
	}
	
	public static void main(String[] args){
		Path path = Paths.get("./zoo/armandilo/shells.txt");
		
		printPathInformation(Paths.get("/zoo/armandilo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armandilo/shells.txt"));
		
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is absolute? " + path1.isAbsolute());
		System.out.println("Path1 exists? " + Files.exists(path1));
		
		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is absolute? " + path2.isAbsolute());
		System.out.println("Absolute path: " + path2.toAbsolutePath());
		
		Path path3 = Paths.get("/mamal/carnivore/raccon.image");
		
		System.out.println("Path is path: " + path3);
		
		System.out.println("Subpath from 0 to 3 is " + path3.subpath(0,3));
		System.out.println("Subpath from 1 to 3 is " + path3.subpath(1,3));
		System.out.println("Subpath from 2 to 3 is " + path3.subpath(2,3));
		System.out.println("Subpath from 1 to 2 is " + path3.subpath(1,2));
		
		Path path4 = Paths.get("fish.txt");
		Path path5 = Paths.get("zoo/birds.txt");
		System.out.println(path4.relativize(path5));
		System.out.println(path4.resolve(path5));
		System.out.println(path5.resolve(path4).normalize());
		
		try{
			System.out.println(path.toRealPath());
			System.out.println(Paths.get(".").toRealPath());
		}catch(IOException e){
			e.printStackTrace();
		}
	}	
}