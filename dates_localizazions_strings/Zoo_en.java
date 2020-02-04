import java.util.*;

public class Zoo_en extends ListResourceBundle{
	
	protected Object[][] getContents(){
		return new Object[][]{
			{"hello", "Hello"},
			{"open", "The zoo is open"}};
		}
		
	
	public static void main(String[] args){
		
		Locale locale = new Locale("en", "CA");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		System.out.print(rb.getString("hello"));
		System.out.print(". ");
		System.out.print(rb.getString("name"));
		System.out.print(" ");
		System.out.print(rb.getString("open"));
		System.out.print(" ");
		System.out.print(rb.getString("visitor"));
		
	}
}
	