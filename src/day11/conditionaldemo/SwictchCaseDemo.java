package day11.conditionaldemo;

import java.util.Scanner;

public class SwictchCaseDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice :");
		int choice = input.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("this is addition.");
			break;
		case 2:	
			System.out.println("this is substraction.");
			break;
		case 3:
			System.out.println("this is multiplication.");
			break;
		case 4:
			System.out.println("this is division.");
			break;
			default:
			System.out.println("wrong choice");
			break;
		} //end
			System.out.println("exit");
				
		
	}

}
