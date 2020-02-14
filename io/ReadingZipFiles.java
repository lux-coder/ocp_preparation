import java.util.zip.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class ReadingZipFiles{
	
	public static void main(String[] args){
		
		String fileName = "archive.zip";
		
		try(InputStream is = new FileInputStream(new File(fileName));
			ZipInputStream zis = new ZipInputStream(is);
			DataInputStream dis = new DataInputStream(zis);){
				
			ZipEntry entry = zis.getNextEntry();
			
			while(entry != null){
				
				//System.out.println(entry);
				if(entry.isDirectory()){
					System.out.println("Reading directory " + entry);
				} else {
					if(entry.getName().endsWith(".bin")){
						System.out.println("Reading file " + entry);
						List<Integer> ints = new ArrayList<>();
						try{
							while(true){
								ints.add(dis.readInt());
							}
						} catch(EOFException e){}
						System.out.println("ints: " + ints.size());
					} else if(entry.getName().endsWith(".txt")){
						System.out.println("ReadingFile " + entry);
						String content = dis.readUTF();
						System.out.println("Content = " + content);
					}
				}
				
				entry = zis.getNextEntry();
			}
			
			
		} catch(IOException e){
			
		}
		
	}
	
}