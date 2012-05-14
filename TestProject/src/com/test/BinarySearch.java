package com.test;

import java.util.Arrays;

public class BinarySearch {
	
	public static int[] a = {2,3,422,28,9,37,64,5,996,41,94};
	
	public static int search(int[] a,int key) {
		int i = 0;
		int j = a.length-1;
		int mid = (i+j)/2;
		while(i<j) {
		    if(a[mid]<key) {
			    i=mid+1;
		    }
		    else if(a[mid]>key) {
		    	j=mid-1;
		    }
		    else
		    {
		        return mid;
		    }
		    mid = (i+j)/2;
	    }
		
		return -1;
	}
	
	public static void main(String args[]) {
		Arrays.sort(a);
		
		//print();
		System.out.println(search(a,6));
	}
}
