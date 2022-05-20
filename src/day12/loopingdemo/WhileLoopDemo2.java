package day12.loopingdemo;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        boolean flag = true; 
        
        while(flag) {
        	System.out.println("Enter name: ");
        	String name = input.next();
        	System.out.println("name is: " +name);
        	if (name.equals("santosh")) {
        		flag = false;
        	}
        }
        System.out.println("Loop terminated!!!");
	}

}
