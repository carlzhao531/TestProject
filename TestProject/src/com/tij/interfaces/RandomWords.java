package com.tij.interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable{	
	private static Random rand = new Random(42);
	private static final char[] capitals = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers =
			"abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels =
			"aeiou".toCharArray();
	private int count;
	
	public RandomWords(int count) {
		this.count = count;
	}
	
	public int read(CharBuffer cb) {
		if(count-- == 0) {
			return -1;
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i=0; i<4; i++) {
			cb.append(lowers[rand.nextInt(lowers.length)]);
			cb.append(vowels[rand.nextInt(vowels.length)]);
			
		}
		cb.append(" ");
		return 3; //Number of characters append
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(new RandomWords(3));
		while(s.hasNext()) {
				System.out.println(s.next());
		}
	}
}
