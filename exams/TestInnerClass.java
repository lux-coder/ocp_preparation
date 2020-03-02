class A {
    public void print(String name) {
        class B {
            B() {
                System.out.println(name); //Line 5
            }
        }
		//if here everything is good
		//B obj = new B(); //Line 9
    }
	//instantiation is outside method so compile error
    B obj = new B(); //Line 9
}
 
public class TestInnerClass {
    public static void main(String[] args) {
        new A().print("OCP"); //Line 14
    }
}