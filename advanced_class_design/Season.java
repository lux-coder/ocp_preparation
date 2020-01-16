public enum Season{
	//WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	WINTER {public void printHours(){System.out.println(9am-3pm);}},
	SPRING {public void printHours(){System.out.println(9am-5pm);}},
	SUMMER {public void printHours(){System.out.println(9am-7pm);}},
	FALL {public void printHours(){System.out.println(9am-5pm);}};
	
	public abstract void printHours();
	
	private String expectedVisitors;
	
	private Season(String expectedVisitors){
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors(){
		System.out.println(expectedVisitors);
	}
}