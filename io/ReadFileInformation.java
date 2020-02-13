import java.io.File;

public class ReadFileInformation{
	
	public static void main(String[] args){
		
		//File file = new File("C:\\Users\\lux-coder\\Projects\\ocp_preparation\\io\\zoo.txt");
		File file = new File("C:\\Users\\lux-coder\\Projects\\ocp_preparation\\io");
		System.out.println("File exists: " + file.exists());
		if(file.exists()){
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Is directory: " + file.isDirectory());
			System.out.println("Parent path: " + file.getParent());
			if(file.isFile()){
				System.out.println("File size: " + file.length());
				System.out.println("File last modified: " + file.lastModified());
			} else{
				for(File subfile: file.listFiles()){
					System.out.println("\t" + subfile.getName());
				}
			}
		}
	}	
}