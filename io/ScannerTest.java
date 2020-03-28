import java.util.*;

public class ScannerTest{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String input = "", output = "";
		
		System.out.println("Enter message");
		while(true){
			input = scanner.nextLine();
			
			if(input.equalsIgnoreCase("Exit"))
				break;
			output += input.toUpperCase() + " ";
		}
		System.out.println("Your message: " + output);
		
		scanner.close();
		
	}
	
}