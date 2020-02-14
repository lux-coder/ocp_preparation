import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;

public class ReadingBytes{
	
	public static void main(String[] args){
		
		String fileName = "ints.bin.gz";
		
		try{
			Path path = Paths.get(fileName);
			long size = Files.size(path);
			System.out.println(path + " size: " + size);		
		} catch(IOException e){			
		}
		
		try(InputStream is = new FileInputStream(new File(fileName));
			GZIPInputStream gzis = new GZIPInputStream(is);
			DataInputStream dis = new DataInputStream(gzis);){
			
			List<Integer> ints = new ArrayList<>();
			
			try{
				while(true){
					ints.add(dis.readInt());
				}
			} catch(EOFException e) {}
			
			System.out.println("ints: " + ints.size());			
			
		} catch(IOException e){			
		}		
	}	
}