public class IceCream{
	enum Flavors{
		VANILA, CHOCOLATE, STRAWBERY
	}
	
	public static void main(String[] args){
		Flavors f = Flavors.STRAWBERY;
		switch(f){
			//case 0: System.out.println("vanila");
			case VANILA: System.out.println("vanila");
			//case 1: System.out.println("chocolate");
			case CHOCOLATE: System.out.println("chocolate");
		}
	}
}