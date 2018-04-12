package com.program.practice.math;

// Swap two numbers without using third variables
public class swapNumWOThirdVar {

	public static void main(String[] args) {
		int x =10;
		int y = 30;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		

	}

}
