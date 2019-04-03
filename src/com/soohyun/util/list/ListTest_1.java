package com.soohyun.util.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {

	public void ex2() {
		//1.
		
	}
	
	
	
	public void ex1() {
		//숫자를 입력 받아서 ex) 3
		//해당 숫자만큼 랜덤한 숫자를 3개 생성해서
		//List에 추가하고 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int count = sc.nextInt();
		Random rd = new Random();
		ArrayList ar = new ArrayList(); 
		
		for(int i=0; i<count; i++) {
			ar.add(rd.nextInt());
		}
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
	
	public static void main(String[] args) {
		new ListTest_1().ex1();
	}
	
	
}
