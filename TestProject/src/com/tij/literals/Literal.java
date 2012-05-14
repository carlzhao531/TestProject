package com.tij.literals;

public class Literal {
	public static void main(String args[]) {
		int i = 0xa3;
		System.out.println(Integer.toBinaryString(i));
		int j = 12322;
		System.out.println(Integer.toHexString(j));
		
		String s1 = "asdf";
		String s2 = "dfjei";
		String s3 = "asdf";
		
		System.out.println(s1 != s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 != s3);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
}
