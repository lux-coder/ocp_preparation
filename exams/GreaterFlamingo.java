class Bird implements Flyable {
    public void fly() {
    }
}
   
abstract class Catbirds extends Bird {
   
}
   
abstract class Flamingos extends Bird {
    public abstract String color();
}
   
public class GreaterFlamingo extends Flamingos {
    public String color() {
        System.out.println("The color is pink");
		return "a";
    }    
	
	public static void main(String[] args){}
}
   
interface Flyable {
    void fly();
}