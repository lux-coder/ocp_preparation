import java.util.*;

public class UpperBoundedWildcards{
	
	public static void main(String[] args){
		
		List<? extends Number> list = new ArrayList<Integer>(Arrays.asList(1,2,3, 3));
		
		//list becomes logicaly imutable when working with wildcards and upperbounds
		/* list.add(new Integer(1));
		list.add(2);
		list.add(3);
		 */
		 
		System.out.println(total(list));
		
	}
	
	public static long total(List<? extends Number> list){
		long count = 0;
		for(Number n : list){
			count += n.longValue();
		}
		return count;
	}
}