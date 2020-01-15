class Bobcat{
	public void findDen(){}
}

public class BobcatKitten extends Bobcat{
	//override, has same method signature
	public void findDen(){}
	//overload, method parameters vary by type and/or number
	public void findDen(boolean b){}
	//other method, case sensitive
	public void findden() throws Exception(){return 0;}
}