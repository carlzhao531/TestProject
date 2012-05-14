package com.tij.operator;

public class Precedence {
	
	public static void main(String args[]) {
		int i = 1, j = 2, k = 3;
		int a = i + j - 2/2 + k;
		int b = i + (j-2)/(2 + k); 
		System.out.println("a: "+ a+ " b: "+b);
	}
}
