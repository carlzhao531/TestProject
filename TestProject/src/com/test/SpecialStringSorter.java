package com.test;

import java.util.ArrayList;
import java.util.List;

public class SpecialStringSorter {
	public static void fun(List<String> s,List<String> rs){
		if(s.size()==1){
			rs.add(s.get(0));
			System.out.println(rs.toString());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rs.remove(rs.size()-1);
		}else{
			for(int i=0;i<s.size();i++){
				rs.add(s.get(i));
				List<String> tmp = new ArrayList<String>();
				for(String ts:s)
					tmp.add(ts);
				tmp.remove(i);
				fun(tmp,rs);
				rs.remove(rs.size()-1);
			}
		}
	}
    // main 方法
	public static void main(String[] args)
	{
		//EHAXOLTR
		List s= new ArrayList();
		List rs= new ArrayList();
		s.add("E");
		s.add("H");
		s.add("A");
		s.add("X");
		s.add("O");
		s.add("L");
		s.add("T");
		s.add("R");
		fun(s,rs);
			
	}
}