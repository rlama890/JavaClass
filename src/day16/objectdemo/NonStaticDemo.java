package day16.objectdemo;

public class NonStaticDemo {
		
	
       //non-static (instance) variable	
		String name = "ram";
		
	   //non-static method
		public void sayHello() {
			System.out.println("hello....");
		}
		
	public static void main(String[] args) {
			System.out.println("main");
			NonStaticDemo obj = new NonStaticDemo();
			System.out.println("obj.name");
			obj.sayHello();
	}

}
