package com.programs.practice.zgeek;

import java.util.Scanner;

/**
 * Given a string S, the task is to change the string according to the condition; 
 * If the first letter in a string is capital letter then change the full string to capital letters, 
 * else change the full string to small letters.
  * 
  * Input:
  * The first line of input contains an integer T denoting the number of test cases. 
  * Then T test cases follow. Each test case contains a string S.
  * 
  * Output:
  * For each test case, print the changed string in a new line.
  * 
  * Constraints:
  * 1<=T<=200
  * 1<=|string length|<=104
  * 
  * Example:
  * Input:
  * 2
  * geEkS
  * FoR
  * 
  * Output:
  * geeks
  * FOR

 * @author Saswat
 *
 */
public class ChangeString {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in); 
	int numTestCase=sc.nextInt();  
	String[] inputArr = new String[numTestCase];
	
	for(int i=0;i<inputArr.length;i++) {
		inputArr[i] = sc.next();
	}
	
	for(int i=0;i<inputArr.length;i++) {
		if(97 <= (int)inputArr[i].charAt(0) && 127 >= (int)inputArr[i].charAt(0)) {
			inputArr[i] = inputArr[i].toLowerCase();
		}else if(65 <= (int)inputArr[i].charAt(0) && 90 >= (int)inputArr[i].charAt(0)) {
			inputArr[i] = inputArr[i].toUpperCase();
		}
	}
	
	System.out.println("Output : ");
	for(int i=0;i<inputArr.length;i++) {
		System.out.println(inputArr[i]);
	}
	}

}
