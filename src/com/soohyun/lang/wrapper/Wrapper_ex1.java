package com.soohyun.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	
	public void ex1() {
		//주민번호를 입력
		//1. 나이가 몇이냐 앞 두자리 현재년도-태어난년도
		//2. 3월부터 5월 사이 태어난 사람 : 봄
		//6월부터 8월 : 여름  9~11: 가을 12~2 : 겨울
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String jumin = sc.next(); //970212-1234567
		String age = jumin.substring(0, 2);
		String state = jumin.substring(2, 4);
		int state2 = Integer.parseInt(state);
		int age1 = Integer.parseInt(age);
		
		
		//나이 구하는 식
		if(age1/10 == 0) {
			int total = 2019-(2000+age1);
			System.out.println("나이 : "+total);
		}else {
			int total = 2019-(1900+age1);
			System.out.println("나이 : "+total);
		}
		
		if(state2 >=3 && state2<=5) {
			System.out.println("봄");
		}else if(state2>=6 && state2<=8) {
			System.out.println("여름");
		}else if(state2>=9 && state2<11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
	}
	

}
