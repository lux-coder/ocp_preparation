import java.util.zip.*;
import java.io.*;
import java.util.stream.*;

public class WritingZipFiles{
	
	public static void main(String[] args){
		
		String fileName = "archive.zip";
		
		try(OutputStream os = new FileOutputStream(new File(fileName));
			ZipOutputStream zos = new ZipOutputStream(os);
			DataOutputStream dos = new DataOutputStream(zos);){
				
			ZipEntry dirEntry = new ZipEntry("bin/");
			zos.putNextEntry(dirEntry);
			
			ZipEntry binFileEntry = new ZipEntry("bin/ints.bin");
			zos.putNextEntry(binFileEntry);
			
			IntStream.range(0,1000)
				.forEach(i -> {try {dos.writeInt(i);} catch(IOException e) {} }
				);
				
			
			ZipEntry otherDirEntry = new ZipEntry("text/");
			zos.putNextEntry(otherDirEntry);
			
			ZipEntry textFileEntry = new ZipEntry("text/file.txt");
			zos.putNextEntry(textFileEntry);
			
			dos.writeUTF("This is some text content");
			
	} catch(IOException e){
		
	}
		
	}
	
}