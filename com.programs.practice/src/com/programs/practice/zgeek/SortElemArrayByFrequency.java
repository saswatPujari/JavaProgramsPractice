package com.programs.practice.zgeek;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Given an array of integers, sort the array according to frequency of elements. 
 * For example, if the input array is {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}, 
 * then modify the array to {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}. 
 * If frequencies of two elements are same, print them in increasing order.
 * 
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. 
 * The description of T test cases follows. The first line of each test case contains 
 * a single integer N denoting the size of array. The second line contains N space-separated 
 * integers A1, A2, ..., AN denoting the elements of the array.
 * 
 * Output:
 * Print each sorted array in a seperate line. For each array its numbers should be seperated by space.
 * 
 * Constraints:
 * 1 ≤ T ≤ 70
 * 30 ≤ N ≤ 130
 * 1 ≤ A [ i ] ≤ 60 
 * 
 * Example:
 * Input:
 * 1
 * 5
 * 5 5 4 6 4
 * 
 * Output:
 * 4 4 5 5 6 

 * @author Saswat
 *
 */
public class SortElemArrayByFrequency {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		int numTestCase=sc.nextInt();  
		String[] inputArr = new String[numTestCase];
		
			// accepting the input array from console
			for(int a=0;a<numTestCase;a++) {
				int n = sc.nextInt();
				int[] array = new int[n];
				for(int k=0;k<n;k++) {
					array[k] = sc.nextInt();
				}
			
			// storing unique elements along with their frequencies into a map
			int key=0;
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i=0;i<array.length;i++) {
				int count = 1;
				int start=0;
				if(!map.containsKey(array[i])) {
					start=i;
					for(int j=start+1;j<array.length;j++) {
						if(array[j]==array[start]) {
							count++;
						}
					}
					map.put(array[start], count);
				}
			}
			
			for(Entry<Integer,Integer> item: map.entrySet()) {
				System.out.println(item.getKey()+","+item.getValue());
			}
			
		}

	}


}
