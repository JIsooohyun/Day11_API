package com.soohyun.lang;

public class Object_1_Object {
	public static void main(String[] args) {
		
		
		//object 클래스의 객체 생성
		Object object = new Object();
		//접근지정자 그외지정자 리턴타입 메서드명([매개변수 선언])
		Object object2= new Object();
		// 참조변수명.멤버메서드명
		//참조변수명.멤버메서드명()
		
		boolean c = object.equals(object2);
		
		String s = object.toString();
		System.out.println(s);
		int has = object.hashCode();
		System.out.println(has);
		
		s = "Hellow world";
		String ss = s.substring(7);
		System.out.println(ss);
		
		ss = s.substring(3, 6);
		System.out.println(ss);
		
		ss = s.toUpperCase();
		System.out.println(ss);
		String sl = s.toLowerCase();
		System.out.println(sl);
		
		String str1 = "test";
		String str2 = "   test test  ";
		ss= str2.trim();  //문자열의 앞부분과 끝부분만 지워준다
		System.out.println(ss);
		System.out.println(str2);
		
		//메서드가 있는 해당 클래스명.메서드명
		ss = String.valueOf('j');
		System.out.println(ss);
		
		System.out.println("--------------------");
		System.out.println();
		String name = "iu-choa-suji-hani";
		String [] names = name.split("-");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		ss = "a, b, c- d- e";
		
		String replace = ss.replace('-', ',');
		System.out.println(replace);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
