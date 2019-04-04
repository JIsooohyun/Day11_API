package com.soohyun.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberInit {

	private String Members;
	private Scanner sc;

	// 이름 , id, pw, age, level = 0, 1, 2
	public MemberInit() {
		StringBuffer sb = new StringBuffer();
		sb.append("iu, iu, iu, 26, 1,");
		sb.append("choa, choa, choa, 30, 2,");
		sb.append("suji, suji, suji, 23, 2,");
		sb.append("hani, hani, hani, 15, 0");

		Members = sb.toString();  //문자열로 바꿔주는 작업

		sc = new Scanner(System.in);

	}

	// 메서드명 : setMember 리턴은 멤버들 MAP
	// 키는 id, 밸류는 member
	public HashMap<String, Member> setMember() {
		HashMap<String, Member> map = new HashMap<String, Member>();
		Member member = null;

		StringTokenizer st = new StringTokenizer(Members, ",");

		while (st.hasMoreTokens()) {  // 다음요소가 있습니까?????
			member = new Member();
			member.setName(st.nextToken().trim());
			member.setId(st.nextToken().trim());
			member.setPw(st.nextToken().trim());
			member.setAge(Integer.parseInt(st.nextToken().trim()));
			member.setLevel(Integer.parseInt(st.nextToken().trim()));
			map.put(member.getId(), member);
		}

		return map;
	}

	public Member memberJoin() {
		// 회원가입
		Member member = new Member();
		System.out.println("이름을 입력하세요");
		member.setName(sc.next());
		System.out.println("ID를 입력하세요");
		member.setId(sc.next());
		System.out.println("PW를 입력하세요");
		member.setPw(sc.next());
		System.out.println("Age를 입력하세요");
		member.setAge(sc.nextInt());
		System.out.println("Level를 입력하세요");
		member.setLevel(sc.nextInt());

		return member;
	}

	public Member memberLogin(HashMap<String, Member> map) {
		Member member = null;
		
		System.out.println("ID를 입력하세요");
		String id = sc.next();
		System.out.println("PW를 입력하세요");
		String pw = sc.next();
		
		member = map.get(id);   //멤버의 아이디값을 넣어준다.
		if(member != null) { // 아이디값이 널이 아니면
			if(!member.getPw().equals(pw)) { //pw가 맞으면 시행하지 않고
				member = null; //틀리면 null이 들어간다. 
			}
		}
				
		/*반복문으로도 돌릴 수 있다.
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			member = map.get(key);
			if (map.get(key).getId().equals(id) && map.get(key).getPw().equals(pw)) {
				member = new Member();
				member = map.get(id);
			} else {
				member = null;
			}
		}*/
		return member;
	}

	public String memberDelete(HashMap<String, Member> map) {

		Member member = new Member();
		System.out.println("ID을 입력하세요");
		String id = sc.next();
		String result = "삭제 실패";

		member = map.get(id);  //키만 알고 있으면 반복문을 안돌리고 바로 꺼낼 수 있다. 
		if(member != null) {
			map.remove(id);
			result = "삭제 완료";
		}
		
		/*
		if (id.equals(map.get(id).getId())) {
			map.remove(id);
			result = "삭제 완료";
		}
		*/
		return result;
	}

}
