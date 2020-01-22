import java.util.*;

public class UnboundedWildcards{
	
	//argument mismatch; List<String> cannot be converted to List<Object>
	//public static void printList(List<Object> list){
	public static void printList(List<?> list){
		for (Object x : list){
			System.out.println(x);
		}
	}
	
	public static void main(String[] args){
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		keywords.add("1");
		
/* 		keywords.add(1);
               ^
		method Collection.add(String) is not applicable
		  (argument mismatch; int cannot be converted to String)
		method List.add(String) is not applicable
		  (argument mismatch; int cannot be converted to String)
		method List.add(int,String) is not applicable
		  (actual and formal argument lists differ in length)
 */			
		printList(keywords);
	}
	
}