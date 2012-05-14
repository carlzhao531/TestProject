package com.tij;

public class StaticTest {
	static int i = 1312;
	public static void main(String args[]) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		
		StaticTest st3 = null;
		//different objects refer to the same i even if the object is not initialized
		System.out.println(st1.i);
		System.out.println(st2.i);
		System.out.println(st3.i);
		
		StaticTest.i++;
		System.out.println(StaticTest.i);
		System.out.println(st2.i);
		System.out.println(st3.i);
	}
}
