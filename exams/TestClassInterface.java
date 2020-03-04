interface House{
	public default String getAddress(){
		return "101 Main Str";
	}
}

interface Office{
	public static String getAddress(){
		return "101 Smart Str";
	}
}

interface WFH extends House, Office{}

class HomeOffice implements Office{
	public String getAddress(){
		return "R No 1, Home";
	}
}

public class TestClassInterface{
	
	public static void main(String[] args){
		Office off = new HomeOffice();
		//System.out.println(off.getAddress());
		System.out.println(((HomeOffice)off).getAddress());
	}
}