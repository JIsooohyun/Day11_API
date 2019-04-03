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
	
	//fix1과 다르게        //매개변수를 받지 않고 똑같은 형태를 나타낼려면?
	public Member setInfo() {  
		Member member = new Member();
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		member.setName(name);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		member.setAge(age);
		
		
		return member;
	}
	
}

