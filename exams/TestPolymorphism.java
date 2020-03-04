class Base{
	public String s1 = "s1";
	public void m1() throws NullPointerException{
		System.out.println("Base: m1()");
	}
}

class Derived extends Base{
	public String s1 = "s1 derived";
	public void m1() throws RuntimeException{
		System.out.println("Derived m1()");
	}
}

public class TestPolymorphism{
	public static void main(String[] args){
		Base obj = new Derived();
		obj.m1();
		System.out.println(obj.s1);
	}
}