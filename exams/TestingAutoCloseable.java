class Resource1 implements AutoCloseable{
	@Override
	public void close(){
		System.out.println("Resource1");
	}
}

class Resource2 implements AutoCloseable{
	@Override
	public void close(){
		System.out.println("Resource2");
	}
}

public class TestingAutoCloseable{
	
	public static void main(String[] args){
		
		try(AutoCloseable r1 = new Resource1();
			AutoCloseable r2 = new Resource2();){
			System.out.println("Test");
		} catch(Exception e){
			e.printStackTrace();
		}
	}	
}