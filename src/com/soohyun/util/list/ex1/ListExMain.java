package com.soohyun.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {

	public static void main(String[] args) {

		//1.정보입력 
		//   이름입력
		//   나이입력   -> ArrayList사용
		//2.정보출력
		//   모든정보출력
		//3.종료
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> ar = new ArrayList<>();  //두개의 타입을 하나로 만들 수 있는  class를 만든다. 뒷 부분은 생략해도 된다.
		ListExInput li = new ListExInput();
		ListExView lv= new ListExView();
		int select=0;
		int age;
		String name;
		while(true) {
			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 종      료");
			select = sc.nextInt();
			
			if(select == 1) {
				
				ar = li.setInfo(ar);
			}else if(select == 2) {
				lv.view(ar);
			}else {
				System.out.println("종료합니다.");
				break;
			}
			
		}//while문 
		
		
	}

}
