package com.soohyun.util.map;

import java.util.HashMap;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("n1", 1);
		map.put("n2", 2);  //자동형변환이 안된다
		
		System.out.println(map.get("n1"));
		
		map.put("n1", 3); //같은 키로 들어갈 수 있고 value값을 수정하겠다.
		
		System.out.println(map.get("n1"));
		System.out.println(map);
		
		System.out.println(map.size());
		
		for(int i=0; i<map.size(); i++) {
			System.out.println(map.get(i));
		}
	}
}
