import java.io.*;

public class ConsoleSamplePrint{
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		Console console = System.console();
		
		if(console == null){
			throw new RuntimeException("Console not available!");
		} else {
			console.writer().println("Welcome to Our Zoo");
			console.format("Our zoo has 391 animals nad employs 25 people.");
			console.writer().println();
			console.printf("The zoo spans 128.91 acres.");
		}		
	}
}