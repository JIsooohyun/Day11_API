package com.soohyun.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExInput {

	private Scanner sc;
	private ArrayList ar;
	
	public ListExInput() {
		sc = new Scanner(System.in);
		ar = new ArrayList();
	}
	
	public ArrayList setInfo(ArrayList<Member> ar) {
		Member member = new Member();
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		member.setName(name);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		member.setAge(age);
		
		
		ar.add(member);
		
		return ar;
	}
	
}
