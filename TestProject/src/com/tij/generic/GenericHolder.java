package com.tij.generic;

public class GenericHolder<T> {
	private T obj;
	private void set(T obj){this.obj = obj;}
	private T get(){return obj;}
	
	public static void main(String[] args) {
		GenericHolder<String> holder = new GenericHolder<String>();
		holder.set("item");
		String s = holder.get();
		
	}
}
