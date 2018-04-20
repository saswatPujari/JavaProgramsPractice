package com.programs.practice.zgeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Given a string without spaces, a character, and a count, the task is to print the string after the 
 * specified character has occurred count number of times.
 * Print “Empty string” incase of any unsatisfying conditions.
 * (Given character is not present, or present but less than given count, or given count completes on last index).
 * If given count is 0, then given character doesn’t matter, just print the whole string.
 * 
 * Input:
 * First line consists of T test cases. First line of every test case consists of String S.Second line of every test case consists of a character.Third line of every test case consists of an integer.
 * 
 * Output:
 * Single line output, print the remaining string or "Empty string".
 * 
 * Constraints:
 * 1<=T<=200
 * 1<=|String|<=10000
 * 
 * 
 * Example:
 * Input:
 * 2
 * Thisisdemostring
 * i    
 * 3
 * geeksforgeeks
 * e
 * 2
 * 
 * Output:
 * ng
 * ksforgeeks

 * @author Saswat
 *
 */
public class PrintRemainingString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numTestCase = sc.nextInt();
		List<String> outList = new ArrayList<>();
		
		for(int a=0;a<numTestCase;a++) {
			String str = sc.next();
			char x = sc.next(".").charAt(0);
			int count = 0;
			int occr =sc.nextInt();
			for(int i =0;i<str.length();i++) {
				if(str.charAt(i)==x) {
					count++;
					if(count==occr) {
						outList.add(str.substring(i+1));
					}
				}
			}
			
		}
		
		for(String item: outList) {
			System.out.println(item);
		}
	}

}
