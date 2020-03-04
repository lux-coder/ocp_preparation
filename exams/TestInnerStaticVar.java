class Outer{
	private static int i = 10;
	private int j = 20;
	
	static class Inner{
		void add(){
			System.out.println(i + Outer.j);
		}
	}
}

public class TestInnerStaticVar{
	
	public static void main(String[] args){
		Outer.Inner inner = new Outer.Inner();
		inner.add();	
	}
}