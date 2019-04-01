package com.soohyun.lang.string;

import java.util.Comparator;

public class StringTest_1 {

	public static void main(String[] args) {
		
		
	
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		String s1 = "iu";
		String s2 = "iu";
		String s3 = new String("iu");
		String s4 = new String("iu");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		
		
		System.out.println(s3.equals(s4));
		
		
		String str = "choa";
		char ch = str.charAt(1);
		System.out.println(ch);
		
		System.out.println("----------------");
		StringEx_1 ex = new StringEx_1();
		ex.ex2();
		System.out.println("----------------");
		
		//String d  = "hello world";
		//int d1 = d.indexOf("o", 5);
		//System.out.println(d1);
		
		str = "";
		int l = str.length(); //isEmpty   0이면 true 아니면 false
		System.out.println(l);
		System.out.println("------------------");
		
		ex.ex3();
		
	}	
	
}
