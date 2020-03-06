import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
import java.util.stream.*;
import java.util.function.*;

public class TestNio{
	
	public static void main(String[] args) throws IOException{
		
		Path path = Paths.get("F:\\A\\B\\C\\Book.java");
		System.out.println(path.subpath(1,4));
		
		//subpath has start inclusive, and end exclusive
		//so path is B\C\Book.java
		
		Path path1 = Paths.get("F:\\A\\B\\C");
		Path path2 = Paths.get("F:\\A");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
		// ..\..
		// B\C
		System.out.printf("%d, %s, %s", path1.getNameCount(), path1.getFileName(), path1.getName(2));
		//3 C C
		
		Path path3 = Paths.get("C:", "TEMP", "msg");
		
		try(BufferedReader reader = Files.newBufferedReader(path3)){
			String str = null;
			while((str = reader.readLine()) != null){
				System.out.println(str);
			}
		}
		
		Path root = Paths.get("C:\\Temp");
		BiPredicate<Path, BasicFileAttributes> predicate = (p,a) -> p.toString().endsWith("txt");
		try(Stream<Path> paths = Files.find(root, 2, predicate)){
			paths.forEach(System.out::println);
		}
		//root is first depth, Parent is second level depth
		
		Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home")));
		//not recursive
		//files.forEach(System.out::println);
		
		//for recursive use Files.walk
		Stream<Path> filesRecursive = Files.walk(Paths.get("C:\\Temp"));
		//filesRecursive.forEach(System.out::println);
		
		Path path4 = Paths.get("F:\\A\\..\\--\\.\\B\\Book.java");
		System.out.println(path4.toAbsolutePath());
		
		Path file1 = Paths.get("F:\\A\\B\\C");
		Path file2 = Paths.get("Book.java");
		System.out.println(file1.resolve(file2));
		System.out.println(file1.resolveSibling(file2));
		
		Path src = Paths.get("C:\\Temp\\Parent\\Child");
		Path trgt = Paths.get("C:\\Temp\\Parent\\Child\\New");
		Files.move(src, trgt, StandardCopyOption.REPLACE_EXISTING);
		//Files.move(src, trgt);

		
	}
	
}