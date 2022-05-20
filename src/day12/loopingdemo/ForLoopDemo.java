package day12.loopingdemo;

public class ForLoopDemo {

	public static void main(String[] args) {
		
	    //IDE : Integrated development Environment
		//for(initialization; condition; update(increment/decrement)) {
		int n =10;
		int sum = 0;
		for(int i = 1; i <=n; i++ ) {
			sum = sum + i;
		}
		System.out.println("sum of nth number is: " +sum);
	}
		
	

}
