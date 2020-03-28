import java.io.*;

public class FWriter{
	
	public static void main(String[] args) throws IOException {

		FileWriter writer = new FileWriter("whizlab.txt");
		FileReader reader = new FileReader("whizlab.txt");
		
		writer.write("newWhizlab");
		writer.flush();
		
//		int ch = reader.read();
		
		char[] character = new char[3];
		
		int ch;
		while((ch = reader.read()) != -1){
			reader.read(character);			
			System.out.println(character);
		}
		
		writer.close();
		reader.close();
	}
}