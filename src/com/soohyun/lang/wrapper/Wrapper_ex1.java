package com.soohyun.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	public void ex2() {
		//pw입력
		//대문자 1개 이상 , 소문자 1개이상, 공백은 없어야 하고 숫자1개이상으로 조합
		//최소 여섯자 이상을 만족해라. 
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine();  //공백까지 포함되서 입력됨
		int count =0 ; //문자열의 길이를 담을 변수
		int upper = 0; //대문자의 개수를 담을 변수
		int lower = 0; //소문자의 개수를 담을 변수
		int digit = 0;//숫자의 개수를 담을 변수
		int space = 0; //공백을 담을 변수


		count = pw.length(); //길이 담는부분

		if(count>5) {
			for(int i=0; i<count; i++) {
				char c = pw.charAt(i);
				if(Character.isUpperCase(c) == true){
					upper++;			
				}else if(Character.isLowerCase(c)==true) {
					lower++;
				}else if(Character.isDigit(c) == true) {
					digit++;
				}else if(Character.isWhitespace(c)==true) {
					space++;
				}else {
				}
			}
			if(upper>0 && lower>0 && digit>0 && space==0) {
				System.out.println("ok");
			}else {
				System.out.println("다시 입력하세요");
			}

		}else {
			System.out.println("최소 6글자 이상입력");
		}


	}






public void ex1() {
	//주민번호를 입력
	//1. 나이가 몇이냐 앞 두자리 현재년도-태어난년도
	//2. 3월부터 5월 사이 태어난 사람 : 봄
	//6월부터 8월 : 여름  9~11: 가을 12~2 : 겨울

	Scanner sc = new Scanner(System.in);
	System.out.println("주민등록번호를 입력하세요");
	String jumin = sc.next(); //970212-1234567
	String age = jumin.substring(7, 8);
	String nai = jumin.substring(0, 2);
	String state = jumin.substring(2, 4);

	int state2 = Integer.parseInt(state); //봄,여름, 가을
	int age1 = Integer.parseInt(age); //1과 3부분 구별
	int nai1 = Integer.parseInt(nai); // 97년생인지 확인



	//나이 구하는 식 주민등록번호 1, 2, 3, 4로 구별해야 한다. 
	if(age1 == 1 || age1 == 2) {
		int age2 = 2019-(1900+nai1);
		System.out.println("나이 : "+age2);
	}else if (age1 == 3 || age1 == 5){
		int age2 = 2019-(2000+nai1);
		System.out.println("나이 : "+age2);
	}else {
		System.out.println("다시 입력");
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
