package com.soohyun.util.sort;

public class Member implements Comparable<Member>{


	private String id;
	private int age;
	
		@Override
	public int compareTo(Member o) {
		
		int result =0;
		
		/*if(this.age < o.getAge()) {
			result = 1;
		}else if(this.age > o.getAge()) {
			result = -1;
		}else {
			result = 0;
		}*/
		
		/*
		//Id순으로 a~z : 오름차순
		result =this.id.compareTo(o.getId()); 	//compareTo라는 메서드를 호출하면 리턴값은 int이다.
		if(result >0 ) {
			result = -1;
		}else {
			result = 1;		//받아온 데이터를 그대로 쓰면 오른차순으로 정렬되어 있는데 그역할을 바꾸면 내림차순으로 바꿔서 사용 가능
		}*/
		
		if(this.age < o.getAge()) {
			result = 1; // 1이면 바꾸고
		}else if(this.age > o.getAge()) {
			result = -1; //-1이면 안바꾸고
		}else {
			result = this.id.compareTo(o.getId());
			if(result >0) {
				result = -1;
			}else {
				result = 1;
			}
		}
		return result;
	}
		
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
