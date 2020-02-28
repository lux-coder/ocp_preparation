import java.io.*;
 
public class TestConsole {
    public static void main(String[] args) throws IOException {
        
        System.out.print("Enter any number between 1 and 10: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int num = br.read();
        System.out.println(num);
    }
}