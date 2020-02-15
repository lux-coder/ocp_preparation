import java.util.*;
import java.io.*;
import java.net.*;
import java.nio.file.spi.*;
import java.nio.file.*;

public class JarFileSystemOperations{
	
	public static void main(String[] args) throws IOException{
		
		URI zip = URI.create("jar:file:///C:/Users/lux-coder/Projects/ocp_preparation/nio2/tmp.zip");
		Map<String, String> options = new HashMap<>();
		options.put("create", "true");		
		
		try(FileSystem zipFS = FileSystems.newFileSystem(zip, options);){
			
			Path dir = zipFS.getPath("newDir/");
			zipFS.provider().createDirectory(dir);
			
			Path aesop = Paths.get("aesop.txt");
			Path target = zipFS.getPath("newDir/aesop-compressed.txt");
			
			Files.copy(aesop, target);
			
			Path binDir = zipFS.getPath("bin/");
			Path binFile = zipFS.getPath("bin/ints.bin");
			
			zipFS.provider().createDirectory(binDir);
			
			OutputStream os =
				zipFS.provider().newOutputStream(binFile, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
				
			DataOutputStream dos = new DataOutputStream(os);				
			
			dos.writeInt(10);
			dos.writeInt(20);
			dos.writeInt(30);
			
			dos.close();
			
		} catch(IOException e){
			e.printStackTrace();			
		}
	}	
}