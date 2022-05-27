package day16.objectdemo;

public class ObjectDemo2 {

	public static void main(String[] args) {
		System.out.println(new ObjectDemo2());
		
		//reference variable
		ObjectDemo2 ob1 = new ObjectDemo2();
		System.out.println(ob1);
				
		ObjectDemo2 ob2; //reference variable
		ob2 = new ObjectDemo2();//object
		System.out.println(ob2);
		System.out.println(ob2.hashCode());
		System.out.println("day16.objectdemo.ObjectDemo2@"+Integer.toHexString(ob2.hashcode()));

	}

}
