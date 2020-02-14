import java.io.*;

public class PrintWriterSample{
	
	public static void main(String[] args) throws IOException{
		
		File destination = new File("zoo.log");
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(destination)));){
			out.print("Today weather is: ");
			out.println("Sunny");
			out.print("Today temperature at th zoo is: ");
			out.print(1/3.0);
			out.println('C');
			out.format("It has rained 10.12 inches this year");
			out.println();
			out.printf("It may rain 12.2 more inches this year");			
		}		
	}	
}