import java.io.File;

public class FileSample{
	
	public static void main(String[] args){
		
		File file = new File("C:\\Users\\lux-coder\\Projects\\ocp_preparation\\io\\zoo.txt");
		System.out.println(file.exists());
		
		File parent = new File("C:\\Users\\lux-coder\\Projects\\ocp_preparation");
		File child = new File(parent, "io\\zoo.txt");
		System.out.println(child.exists());
		
	}
	
}