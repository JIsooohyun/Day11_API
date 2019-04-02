package com.soohyun.lang.wrapper;

public class Wrapper_ex3 {

	//random발생
	//0~9사이의 정수를 반환???
	public void ex1() {
		double r1 = Math.random()*10;
		System.out.println((int)r1);
	}
	public static void main(String[] args) {
		new Wrapper_ex3().ex1();
	}

}
