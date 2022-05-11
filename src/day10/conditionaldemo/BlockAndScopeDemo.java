package day10.conditionaldemo;

public class BlockAndScopeDemo {//class block

	int a;
	
	
	public static void main(String[] args) {//main method block

	int b = 5;
	
	for (int i = 1; i <= 5; i++) {//for loop block
		int d =6;
		System.out.println(b);
	//	System.out.println(e);//e cannot print because  it is not within the block
		if (i ==3) {
			int e = 4;
			System.out.println(e);//e is within the block
		
		
		
	}	
	
	public void	sayHello() { //method block
	
	int c;
	}
	
}


//block => {}
//block provides scope