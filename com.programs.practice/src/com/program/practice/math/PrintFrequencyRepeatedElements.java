package com.program.practice.math;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**given an array containing duplicate elements 
 * print the frequency of each unique element
 * @author Saswat
 *
 */
public class PrintFrequencyRepeatedElements {

	public static void main(String[] args) {
		
		int[] array = {3,3,3,3,4,5,5,2,2,2,2,1,1,1,1,1};
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
