import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
import java.util.zip.*;


public class WritingBytes{
	
	public static void main(String[] args){
		
		String pathName = "ints.bin.gz";
		File file = new File(pathName);
		
		try(OutputStream os = new FileOutputStream(file);
			GZIPOutputStream gzos = new GZIPOutputStream(os);
			DataOutputStream dos = new DataOutputStream(gzos);){
				
			//dos.writeInt(10);	
			//dos.writeUTF("Hello");
			
			IntStream.range(0, 1000)
				.forEach(i -> {try {dos.writeInt(i);} catch (IOException e) {} }
				);
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
		try{
			Path path = Paths.get(pathName);
			long size = Files.size(path);
			System.out.println(path + " size: " + size);
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}