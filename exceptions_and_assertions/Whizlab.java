import java.io.*;

class NegativeException extends ClassCastException{
	
	NegativeException(){
		super("Negative value entered, Positve value expected");
	}
	NegativeException(String s){
		super(s);
	}
}

class NotEnoughException extends NegativeException{
	
	NotEnoughException(){
		super("Less than minimum");
	}
}

class Loan{
	
	int amount;
	
	public boolean setAmount(int am){
		if(am < 0)
			throw new NegativeException();
		else if(am < 500)
			throw new NotEnoughException();
		else{
			amount = am;
			return true;
		}
	}
}

public class Whizlab{
	
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Loan l = new Loan();
		
		System.out.println("Enter the amount");
		
		try{
			int i = Integer.parseInt(br.readLine());
			l.setAmount(i);
		} catch(IOException e){
			System.out.println(e);
		}
		
		System.out.println(l.amount);
		
	}
}