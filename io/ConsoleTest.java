import java.io.*;

public class ConsoleTest{
	
	public static void main(String[] args){
		
		Console console = System.console();
		
		String input = "", output="";
		
		if(console != null){
			console.printf("Enter message:\n");
			
			while(true){
				input = console.readLine();
				if(input.equalsIgnoreCase("exit")){
					break;					
				}
			output += input.toUpperCase() + " ";
			}			
		}
		console.format("Your message: %s", output);		
	}	
}