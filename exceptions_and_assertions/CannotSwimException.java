public class CannotSwimException extends Exception{
	
	//with default constructor
	public CannotSwimException(){
		super();
	}
	
	//wrapping another exception inside yours
	public CannotSwimException(Exception e){
		super(e);
	}
	
	//adding custom message to exception
	public CannotSwimException(String message){
		super(message);
	}
	
}