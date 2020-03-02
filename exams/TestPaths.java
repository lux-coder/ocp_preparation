import java.nio.file.*;

public class TestPaths{
	
	public static void main(String[] args){
		
		Path path1 = Paths.get("F:", "Other", "Logs");
		Path path2 = Paths.get("..", "..", "Shortcut", "Child.lnk", "Message.txt");
		//Path path3 = path1.resolve(path2).normalize();
		Path path3 = path1.resolve(path2);
		//Path path4 = path1.resolveSibling(path2).normalize();
		Path path4 = path1.resolveSibling(path2);
		System.out.println(path3.equals(path4));
		System.out.println(path3);
		System.out.println(path4);
		
		
	}
	
}