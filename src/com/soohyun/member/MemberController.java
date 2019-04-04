package com.soohyun.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MemberController {
	private MemberInit mi;
	private MemberView mv;
	private HashMap<String, Member> map;
	private Scanner sc;

	public MemberController() {
		mi = new MemberInit();
		mv = new MemberView();
		sc = new Scanner(System.in);
	}

	public void start() {
		map = mi.setMember(); //기존에 있는 회원들을 꺼낸다. 
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원탈퇴");
			System.out.println("4. 회원전체정보보기");
			System.out.println("5. 종료");
			int select = sc.nextInt();

			if(select == 1) {
				Member member = mi.memberJoin();
				map.put(member.getId(), member);

			}else if(select ==2) {
				Member member = mi.memberLogin(map);
				if(member != null) {
					mv.view(member);
				}else {
					System.out.println("다시 로그인하세요");
				}
			}else if(select == 3) {
				String str = mi.memberDelete(map);
				mv.view(str);

			}else if(select == 4) {
				mv.view(map);
			}else {
				System.out.println("종료");
				break;
			}
		}
	}

}
