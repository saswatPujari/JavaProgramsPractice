package com.program.practice.math;

// write a java program to reverse an integer
public class ReverseNumber {

	public static void main(String[] args) {
		
		int num =123;
		int rev=0;
		while(num !=0) {
			rev = (num/10)+(num%10);
			num=num/10;
		}
		
		System.out.println(rev);

	}

}
