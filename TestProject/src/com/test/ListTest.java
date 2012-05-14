package com.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<List<String>> listlist = new ArrayList<List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("1");list1.add("2");list1.add("3");
		List<String> list2 = new ArrayList<String>();
		list2.add("1");list2.add("3");
		
		listlist.add(list1);
		listlist.add(list2);
		
		list2.add("5");list2.add("6");
		
		for(List<String> list : listlist) {
			for(String s : list) {
				System.out.print(" "+s);
			}
			System.out.println();
		}
	}
}
