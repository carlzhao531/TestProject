package com.tij.innerclass;


public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
		
	}
	
	protected static class ParcelDestination implements Destination {
		private String label; 
		
		public ParcelDestination(String whereTo) {
			label = whereTo;
		}
		public String readLabel() {
			return label;
		}
		public static void f(){}
		static int x = 12;
		static class AnotherLevel {
			public static void f() {
				System.out.println("Another Level f() x="+x);
			}
			static int x = 10;
		}
	}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String[] args) {
		Contents c = contents();
		Destination d = destination("Tasmania");
		ParcelDestination.AnotherLevel.f();
		System.out.println(d.readLabel());
	}
}
