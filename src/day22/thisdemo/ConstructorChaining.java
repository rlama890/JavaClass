package day22.thisdemo;

public class ConstructorChaining {
	
	public ConstructorChaining() {
		this(4);
		System.out.println("default Constructor.");
	}
	public ConstructorChaining(int a) {
		this(a,5);
		System.out.println("1 arg Constructor.");
	}
	public ConstructorChaining(int a, int b) {
		System.out.println("2 arg Constructor.");
	}
	public static void main(String[] args) {
		ConstructorChaining c1 = new ConstructorChaining();
		
		

	}

}
