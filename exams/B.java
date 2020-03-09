class A{
	void m1(){
		System.out.println("public");
	}
}

public class B extends A{	

	protected void m1(){
		System.out.println("default");
	}
	
	public static void main(String[] args){
		
		B b = new B();
		b.m1();
		
		
	}
	
}
	