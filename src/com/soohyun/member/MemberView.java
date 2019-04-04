package com.soohyun.member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberView {

	public void view(HashMap<String, Member> map) {
		
		Member member = new Member();
		Iterator<String> it = map.keySet().iterator(); 
		//Iterator<키의 데이터타입> it = map.키의 타입으로 모아두는 keyset().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Member value = map.get(key);//멤버가 들어가 있는곳에서 key값으로 꺼내라
			this.view(member); //자기자신을 호출해주는 this를 사용한다 
			/*
			System.out.println("이름 : "+value.getName());
			System.out.println("Id : "+value.getId());
			System.out.println("Pw : "+value.getPw());
			System.out.println("Age : "+value.getAge());
			System.out.println("Level : "+value.getLevel());
			System.out.println("=====================");
			*/
		}
		
	}
	
	public void view(Member member) {
		System.out.println("로그인 성공");
		System.out.println("name : "+member.getName());
		System.out.println("ID : "+member.getId());
		System.out.println("PW : "+member.getPw());
		System.out.println("Age : "+member.getAge());
		System.out.println("Level : "+member.getLevel());
	}
	
	public void view(String str) {
		System.out.println(str);
		
	}
}
