package com.soohyun.util.list;

import java.util.ArrayList;

public class ListMain {
	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		//1, 2, 3, 4
		Object e ="";//다형성 
		ar.add("1");
		ar.add(2); //int  -> Integer  : autoBoxing
		ar.add(3.12); //double  -> Double
		ar.add('a');  // char -> character
		
		//String s=ar.get(0); //object타입이라서 에러나는것
		String s=(String)ar.get(0);
		int num = (int)ar.get(1);
		
		ar.add(1, 2000);
		ar.set(1, "500");
		//System.out.println(ar); //주소값이 나오지 않고 그냥 나온이유는 상속받은 오버라이딩해서 나옴
		//ar.clear();
		//ar.remove(1);
		//ar.remove("2");
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();  //generic  <이런타입>만 집어넣도록 제한한다.
		ar2.add(1);
		//ar2.add("2"); 
		int num1 = ar2.get(0);
	}
}
