package com.test;

public class TestColorFlag {
	
	//transfer to BWR
	public static void main(String args[]) {
		char[] ff = {'R','W','B','R','W','B','W','B','R','B','R','W','B','R','B'};
		int  b = 0 ,w = 0,r = ff.length - 1;
		while(w<r) {
			switch(ff[w]) {
				case 'W':
					w++;
					break;
				case 'B':
					swap(ff,w,b);
					w++;b++;
					break;
				default:
					while(w<r && ff[r] == 'R')
						r--;
					swap(ff,w,r);
					r--;
			}
		}
		for(int i=0; i<ff.length; i++) {
			System.out.print(ff[i]+" ");
		}
	}
	
	private static void swap(char[] ff,int i,int j) {
		char temp = ff[i];
		ff[i] = ff[j];
		ff[j] = temp;
	}
}
