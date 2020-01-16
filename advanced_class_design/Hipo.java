//toString
//import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Hipo{
	private String name;
	private double weight;
	
	public Hipo(String name, double weight){
		this.name = name;
		this.weight = weight;		
	}
	
/* 	@Override
	public String toString(){
		return name;
	} */
	
 	public String toString(){
		return "Name: " + name + " Weight: " + weight;
	}
 	
 
/* 	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
  */
  
/*   @Override public String toString(){
	  return ToStringBuilder.reflectionToString(this, 
							ToStringStyle.SHORT_PREFIX_STYLE); 
  }
 */
 
	public static void main(String[] args){
		Hipo h = new Hipo("Harry",123.4);
		System.out.println(h);
	}
	
}