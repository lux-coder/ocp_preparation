public enum OnlyOnce{
	ONCE(true), TWICE(true), TRICE(false);
	
	private OnlyOnce(boolean b){
		System.out.println("constructing");	
	}
	
	public static void main(String[] args){
		OnlyOnce firstCall = OnlyOnce.ONCE;
		//OnlyOnce secondCall = OnlyOnce.TWICE;
	}
}