public class TurkeyCage implements AutoCloseable{
	
	public void close(){
		System.out.println("Close gate");
	}
	
	//try-with-resource statment throws checke exception so
	//main method does need to handle it or declare it
	public static void main(String[] args) throws Exception{
		
		try(TurkeyCage t = new TurkeyCage()){
			System.out.println("put turkeys in");
		}
		
		try(StuckTurkeyCage st = new StuckTurkeyCage()){
			System.out.println("put turkeys in");
		}		
	}	
}

class StuckTurkeyCage implements AutoCloseable{
	
	public void close() throws Exception{
		throw new Exception("Cage door does not close");
	}	
}