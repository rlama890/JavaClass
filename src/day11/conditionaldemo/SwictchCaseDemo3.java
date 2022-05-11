package day11.conditionaldemo;

import java.util.Scanner;

public class SwictchCaseDemo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice :");
		String choice = input.next();
		switch (choice) {
		
		case "add":
			System.out.println("this is addition.");
			break;
		case "subtract":	
			System.out.println("this is substraction.");
			break;
		case "mul":
			System.out.println("this is multiplication.");
			break;
		case "div":
			System.out.println("this is division.");
			break;
			default:
			System.out.println("wrong choice");
			break;
		} //end
			System.out.println("exit");
				
		
	}

}

	}

}
