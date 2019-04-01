package com.soohyun.lang;

public class Object_2_Wrapper {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		Integer i = new Integer(10);
		Integer i2 = new Integer("20");
		
		
		int n2 = i2.intValue();
		System.out.println(n2*2);
		
		System.out.println("--------------");
		String num1 = "3.2";
		
		
		Double d = new Double(num1);
		double d1 = d.doubleValue();
		System.out.println(d1*2);
		
		
		n2 = Integer.parseInt("20");
		d1 = Double.parseDouble("3.2");
		
		
	}

}
