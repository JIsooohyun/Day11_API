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
	public ArrayList setInfo(ArrayList ar) {
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		ar.add(name);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		ar.add(age);
		
		return ar;
	}
	
}
