package day17.methoddemo;

public class MethodDemo1 {
	 
		
//		<access modifier> void <Method name> (){
//
//	  method definition
		public void sayHello() {
			System.out.println("Hello Hello Hello...");
		}
		
//		<access modifier> void <Method name> (any type and any numbers of parameter){
		
		public void displayInfo(String name, int age, double salary, boolean isEligible) {
			System.out.println("Name is: "+ name);
			System.out.println("Age is: "+ age);
			System.out.println("Salary is: "+ salary);
			System.out.println("Eligibility: "+ isEligible);
			
		}
		
		
		public static void main(String[] args){
			System.out.println("main start");
			
			MethodDemo1 obj = new MethodDemo1();
//			method calling
			obj.sayHello();
			
			
			String name = "ram";
			int age = 22; 
			double salary = 4000.2;
			boolean isEligible = true;
			obj.displayInfo(name, age, salary, isEligible);
		
			obj.displayInfo("shyam", 23, 3000.5, false);
			System.out.println("================");
			
			System.out.println("main end");
		}
}

