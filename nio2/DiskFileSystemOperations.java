import java.io.*;
import java.util.*;
import java.net.*;
import java.nio.file.*;
import java.nio.file.spi.*;
import java.util.stream.*;

public class DiskFileSystemOperations{
	
	public static void main(String[] args) throws IOException{
		
		List<FileSystemProvider> installedProviders = FileSystemProvider.installedProviders();
		installedProviders.forEach(System.out::println);
		
		FileSystemProvider fsp = installedProviders.get(0);
		
		FileSystem fileSystem1 = FileSystems.getDefault();
		
		URI rootURI = URI.create("file:///");
		FileSystem fileSystem2 = FileSystems.getFileSystem(rootURI);
		
		System.out.println(fileSystem1 == fileSystem2);
		
		//Path dir = Paths.get("C:\\Users\\lux-coder\\Projects\\ocp_preparation\\nio2\\tmp");
		//Path dir = Paths.get(URI.create("file:///C:/Users/lux-coder/Projects/ocp_preparation/nio2/tmp2"));
		//fsp.createDirectory(dir);
		
		Iterable<Path> rootDirectories = fileSystem2.getRootDirectories();
		rootDirectories.forEach(System.out::println);
		
		Iterable<FileStore> fileStores = fileSystem2.getFileStores();
		//fileStores.forEach(System.out::println);
		fileStores.forEach(fileStore -> System.out.println("name = " + fileStore.name() + " -> " + " type = " + fileStore.type()));
		
	}
	
}