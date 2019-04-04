package com.soohyun.util.map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class MapTest2 {

	public static void main(String[] args) {
		//반복자. 열거형
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		
		System.out.println("====Iterator====");
		//반복할 수 있는  for문 대신 Iterator<e>를 만들었다.
		Iterator it = ar.iterator();
		
		while(it.hasNext()) {  //다음 요소가 있을 때까지 돌린다. 없으면 false
			System.out.println(it.next());			
		}
		
		System.out.println("====HashMap====");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(5, 10);
		map.put(6, 20);
		map.put(7, 30);
		
		Iterator<Integer> it2 = map.keySet().iterator(); //iterator라는 메서드는 collection에 있다.
		
		while(it2.hasNext()) {
			int key = it2.next(); //key값을 꺼내온것이다.
			int value = map.get(key);
			System.out.println(value);
		}
		
		
		System.out.println("====HashCode====");
		Hashtable<String, String> hs = new Hashtable<String, String>();
		hs.put("iu", "26");
		hs.put("choa", "30");
		hs.put("suji", "20");
		
		//열거형
		Enumeration<String> en = hs.keys();
		while(en.hasMoreElements()) {
			String k = en.nextElement();
			System.out.println(hs.get(k));
		}
		
		
		
	}
	
	
	
	
	
	
	
}
