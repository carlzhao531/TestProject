package com.tij.literals;

public class OverFlow {
	public static void main(String args[]) {
		int imax = Integer.MAX_VALUE;
		long lmax = Long.MAX_VALUE;
		System.out.println(imax);
		System.out.println(lmax);
		
		int temp;
	    temp = imax*4;
		System.out.println(temp);
	}
}
