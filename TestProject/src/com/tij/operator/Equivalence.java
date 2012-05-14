package com.tij.operator;

public class Equivalence {
	public static void main(String args[]) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
		
		Integer n3 = new Integer(129);
		Integer n4 = new Integer(129);
		System.out.println(n3==n4);
		System.out.println(n3.equals(n4));
	}
}
