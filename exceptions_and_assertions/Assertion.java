public class Assertion{
	
	//programm needs to be called with -ea
	public static void main(String[] args){
		int numGuests = -5;
		assert numGuests > 0;
		System.out.println(numGuests);
	}
	
}