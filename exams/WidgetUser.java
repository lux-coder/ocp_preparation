class Widget{
	static String sd = "sd";
	String data = "data";
	public void doWidgetStuff(){
		System.out.println(data);
	}
}

class GoodWidget extends Widget{	
	static String sd = "new sd";	
	String data = "big data";	
	public void doWidgetStuff(){
		
	}
}

public class WidgetUser{
	public static void main(String[] args) {
		Widget w = new GoodWidget();
		
		((Widget)w).doWidgetStuff();
		//this is the same as explicit cast has no impact because the class of the referece
		//is not considered while invoking the instance methods at all
		w.doWidgetStuff();
		
		System.out.println(w.sd);
		System.out.println(((GoodWidget)w).sd);
		
		System.out.println(w.data);
		System.out.println(((GoodWidget)w).data);
	}
}