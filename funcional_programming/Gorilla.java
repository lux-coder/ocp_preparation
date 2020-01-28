interface Gorilla {
	String move();
}

public class Gorilla{
	String walk = "walk";
	
	void everyonePlay(boolean baby){
		//effectivly final local variable
		String approach = "amble";
		//if uncommented it is not effectivly final any more
		//approach = "run";
		
		//uses instance variable
		play(() -> walk);
		//uses method parameter (effectivly final)
		play(() -> baby ? "hitch a ride" : "run");
		//if not effectivly final would cause compile error
		play(() -> approach);
	}
	
	void play(Gorilla g){
		System.out.println(g.move);
	}
	
	
}