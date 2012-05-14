package com.tij.innerclass;

public class DotNew {
	public class Inner {
		void inner(){}
	}
	
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		//you must use an object of the outer class to make the object of the inner class
		DotNew.Inner dni = dn.new Inner();
	}
}
