class Primate{
	
	public boolean hasHair(){
		return true;
	}	
}

interface HasTail{
	
	public boolean isTailStriped();	
}

public class Lemur extends Primate implements HasTail{
	
	public int age = 10;
	
	public boolean isTailStriped(){
		return false;
	}
	
	public static void main(String[] args){
		
		Lemur lemur = new Lemur();		
		System.out.println(lemur.age);
		System.out.println(lemur.isTailStriped());
		System.out.println(lemur.hasHair());
		
		System.out.println("--------------------------");
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		//System.out.println(hasTail.age);
		System.out.println(((Lemur)hasTail).age);
		System.out.println(((Lemur)hasTail).hasHair());
		
		System.out.println("---------------------------");
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
						
	}	
}