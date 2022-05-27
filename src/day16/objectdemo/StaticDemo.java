package day16.objectdemo;

public class StaticDemo {

	


		static String studentName = "Raju";
		
		public static void greet() {
			System.out.println("Hello, Good Morning from Nepal.");
		}
		public static void main(String[] args) {
			System.out.println(studentName);
			greet();
			
			//recommended
			System.out.println(StaticDemo.studentName);
			StaticDemo.greet();
		}

	}


