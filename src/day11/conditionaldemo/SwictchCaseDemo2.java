package day11.conditionaldemo;

import java.util.Scanner;

public class SwictchCaseDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter operator :");
		char operator = input.next().charAt(0);
		int a =0; int b = 0;
		if (operator == '+'|| operator == '-' || operator == '*' || operator == '/');{
		
		System.out.println("Enter a :");
		a = input.nextInt();
		System.out.println("Enter b :");
		b = input.nextInt();
		}
		
		switch (operator) {
		case '+':
			int sum = a + b;
			System.out.println("Sum is :" +sum);
			break;
		case '-':
			int sub = a - b;
			System.out.println("Subtraction is :" +sub);
			break;
		case '*':
			int mul = a * b;
			System.out.println("Multiplication is :" +mul);
			break;
		case '/':
			int div = a / b;
			System.out.println("Division is :" +div);

			break;	
			default:
				System.out.println("Wrong operator selection!!");

			break;
		} System.out.println("exit");

	}

}
