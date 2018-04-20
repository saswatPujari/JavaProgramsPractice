package com.program.practice.algorithm;

public class BinarySearch {

	    public static void main(String[] args) {
	         
	        int[] inputArr = {2, 4, 6, 8, 10, 12, 14, 16};
	        int key =16;
	        int pos = 0;
	        
	        int start = 0;
	        int end = inputArr.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (key == inputArr[mid]) {
	                pos=mid;
	            }
	            if (key < inputArr[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        
	        System.out.println(key + " found at position: "+pos);
	    }
}

