package com.tij;

public class ScopeTest {
	public static void main(String args[]) {
		int x = 3;
		{
			int d = 2;
			
		}
		//illegal
		//System.out.println(d);
	}
}
