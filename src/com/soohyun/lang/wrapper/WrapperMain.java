package com.soohyun.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		
		Wrapper_ex1 we = new Wrapper_ex1();
		//we.ex2();
		
		//int num=10;
		
		//System.out.println(Integer.toBinaryString(num));
		Wrapper_ex2 we1 = new Wrapper_ex2();
		//we1.ex1();
		/*
		Integer n1 = new Integer(10);
		int num = n1.intValue();
		num = n1; //autoUnBoxing
		n1 = 20;  //wrapper클래스에서는 허용을 해준다. -> autoBoxing
		
		
		
		StringBuffer s =new StringBuffer();
		System.out.println(s.hashCode());
		s.append("iu");
		System.out.println(s.hashCode());
		s.append("choa");
		
		System.out.println(s.toString());
		String names = s.toString(); 
		
		
		double d1 = 3.14;
		d1 = Math.ceil(d1); //올림
		System.out.println(d1);
		
		d1 = 3.44;
		d1 = Math.floor(d1); //내림
		System.out.println(d1);
		
		d1 = 3.54;
		d1 = Math.round(d1);
		System.out.println(d1);  // 반올림
		
		d1 = Math.random();
		System.out.println("Random : "+d1);
		
		*/
		Wrapper_ex3 we3 = new Wrapper_ex3();
		we3.ex1();
		
	}

}
