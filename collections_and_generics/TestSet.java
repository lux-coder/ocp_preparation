import java.util.*;

public class TestSet{
	
	public static void main(String[] args){
		
		//returns random, unsorted set
		//Set<Integer> set = new HashSet<>();
		
		//returns sorted set
		Set<Integer> set = new TreeSet<>();
		
		boolean b1 = set.add(66);
		System.out.println(b1);
		boolean b2 = set.add(10);
		System.out.println(b2);
		boolean b3 = set.add(66);
		System.out.println(b3);
		boolean b4 = set.add(8);
		System.out.println(b4);
		boolean b5 = set.add(new Integer(2));
		System.out.println(b5);
		
		for(Integer inte : set)
			System.out.print(inte + ",");
		
		NavigableSet<Integer> set2 = new TreeSet<>();
		for(int i=0; i<=20; i++)
			set2.add(i);
		
		System.out.println();
			
		//greates element that is < e, or null if none
		System.out.println(set2.lower(10));
		//greates element that is <= e, or null if none
		System.out.println(set2.floor(10));
		//smallest element that is >= e, or null if none
		System.out.println(set2.ceiling(20));
		//smallest element that is > e, or null if none
		System.out.println(set2.higher(20));
	}
}