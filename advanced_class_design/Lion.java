//equals

//String s1 = new String("lion");
//String s2 = new String("lion");
//System.out.println(s1.equals(s2)); 	true
//StringBuilder sb1 = new StringBuilder("lion");
//StringBuilder sb2 = new StringBuilder("lion");
//System.out.println(sb1.equals(s2));	false

public class Lion{
	private int idNumber;
	private int age;
	private String name;
	
	public Lion(int idNumber, int age, String name){
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;		
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Lion)) 
			return false;
		Lion otherLion = (Lion) obj;
		return this.idNumber == otherLion.idNumber;
	}
	
/* 	public boolean equals(Object obj){
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	public boolean equals(Object obj){
		if (!(obj instanceof LionEqualsBuilder)) return false;
		Lion otherLion = (Lion) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
			.append(idNumber, this.idNumber)
			.append(name, this.name)
			isEquals();		
	} */
}