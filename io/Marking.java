import java.io.*;

public class Marking{
	
	public static void main(String[] args){
		
		try(InputStream is = new FileInputStream("input.txt")){
			System.out.print((char) is.read());
			if(is.markSupported()){
				is.mark(100);
				System.out.print((char)is.read());
				System.out.print((char)is.read());
				is.reset();
			}
			System.out.print((char)is.read());
			System.out.print((char)is.read());
			System.out.print((char)is.read());			
		} catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println();
		
		try(FileInputStream is = new FileInputStream("input.txt")){
			System.out.print((char) is.read());
			is.skip(2);
			System.out.print((char) is.read());
			System.out.print((char) is.read());			
			System.out.print((char) is.read());			
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}