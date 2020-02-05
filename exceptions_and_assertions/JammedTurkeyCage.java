public class JammedTurkeyCage implements AutoCloseable{
	
	public void close() throws IllegalStateException{
		throw new IllegalStateException("Cage door does not close");
	}
	
	public static void main(String[] args){
		
		try(JammedTurkeyCage jtc = new JammedTurkeyCage()){
			System.out.println("put turkeys in");
		} catch(IllegalStateException e){
			System.out.println("caught: " + e.getMessage());
		}

		System.out.println();
		
		try(JammedTurkeyCage jtc = new JammedTurkeyCage()){
			throw new IllegalStateException("turkeys run off");
		} catch(IllegalStateException e){
			System.out.println("caught " + e.getMessage());
			for(Throwable t: e.getSuppressed())
				System.out.println(t.getMessage());
		}		
		
		System.out.println();
		
		//with suppressed exception
		try(JammedTurkeyCage t1 = new JammedTurkeyCage();
			JammedTurkeyCage t2 = new JammedTurkeyCage()){
				System.out.println("turkeys entered cages");
		} catch(IllegalStateException e){
			System.out.println("caught: " + e.getMessage());
			for(Throwable t: e.getSuppressed())
				System.out.println(t.getMessage());
		}
		
		System.out.println();
		
		try(JammedTurkeyCage jtc = new JammedTurkeyCage()){
			throw new RuntimeException("turkeys run of");
		} catch(IllegalStateException e){
			System.out.println("caught: " + e.getMessage());
		}
		
	}	
}