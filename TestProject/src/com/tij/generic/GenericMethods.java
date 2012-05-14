package com.tij.generic;

public class GenericMethods {
	public <T> void f(T x) {
		//System.out.println(x.getClass().getSimpleName());
		System.out.println(x.getClass().getName());
		System.out.println(" "+x.getClass().getGenericInterfaces());
	}
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f("");
		gm.f('a');
		gm.f(1);
		gm.f(gm);
	}
	
}
