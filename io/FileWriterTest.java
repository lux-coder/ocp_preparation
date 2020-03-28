import java.io.*;

public class FileWriterTest{
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fWriter = new FileWriter("whizlab.txt");
		PrintWriter pWriter = new PrintWriter(fWriter, true);
		
		pWriter.write("Whizlabs");
		
		FileReader fReader = new FileReader("whizlab.txt");
		
		char[] buffer = new char[100];
		
		fReader.read(buffer);
		
		pWriter.close();
		fReader.close();
		
		System.out.println(buffer);
		
	}
	
}