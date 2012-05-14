package com.tij.generic;

class Building{}

public class ClassTypeCapture<T> {
	private Class<T> kind;
	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}
	
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	
	public static void main(String[] args) {
		ClassTypeCapture<String> ctc = new ClassTypeCapture(Building.class);
		System.out.println(ctc.f(new Building()));
	}
}
