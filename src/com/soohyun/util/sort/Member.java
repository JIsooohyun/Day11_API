package com.soohyun.util.sort;

public class Member implements Comparable<Member>{


	private String id;
	private int age;
	
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
		System.out.println("this : "+this); //자기 자신을 나타내는 객체주소가 나온다. 
	}
	
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
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









