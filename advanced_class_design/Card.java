public class Card{
	private String rank;
	private String suite;
	
	public Card(String r, String s){
		if(r == null || s == null) throw new IllegalArgumentException();
		rank = r;
		suite = s;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Card)) return false;
		Card c = (Card) obj;
		return rank.equals(c.rank) && suite.equals(c.suite)
	}
	
	public int hashCode(){
		return rank.hashCode();
	}
	
}