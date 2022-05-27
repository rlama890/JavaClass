package day22.thisdemo;

public class ThisDemo3 {
	
	
	
	public void greet(OtherClass o) {
		o.sayHello();
		
	}
	
	public void greetings() {
		
	}

//	public static void main(String[] args) {
//		ThisDemo3 obj = new ThisDemo3();
//		obj.greet(new OtherClass());
		
		public static void main(String[] args) {
			ThisDemo3 obj = new ThisDemo3();
			obj.greet(new OtherClass());


	}

}
