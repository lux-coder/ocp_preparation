public class TryWithResource{
	
	public static void main(String[] args){
		
				
	}
	
	public void oldApproach(Path path1, Path path2) throws IOException{
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try{
			in = Files.newBufferedReader(path1);
			out = Files.newBufferedWriter(path2);
			out.write(in.readLine());
		} finally{
			if(in != null) in.close();
			if(out != null) out.close();
		}		
	}
	
	//automatic resource management
	public void newApproach(Path path3, Path path4) throws IOException{
		try(BufferedReader in = Files.newBufferedReader(path3);
			BufferedWriter out = Files.newBufferedWriter(path4)){
				out.write(in.readLine());
			}
		
		
	}
	
}