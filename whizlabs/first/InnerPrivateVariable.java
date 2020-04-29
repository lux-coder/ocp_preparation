public class InnerPrivateVariable{
	
	public static void main(String[] args){		
		//InnerPrivateVariable.Test t = new InnerPrivateVariable().new Test();
		Test t = new Test();
		t.x = 2;
		t.in();		
	}
	
	static class Test{		
		private int x = 1;
		public void in(){
			System.out.println(x);
		}		
	}	
}