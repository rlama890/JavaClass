package day25.inheritancedemo;

public class ParentTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.name);
		p.greet();
		
		Child c = new Child();
		System.out.println(c.name);
		c.greet();
	}

}
