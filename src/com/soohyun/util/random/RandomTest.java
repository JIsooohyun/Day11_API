package com.soohyun.util.random;


//import java.lang.*이 생략되어 있다.
import java.util.Random;


public class RandomTest {
	public static void main(String[] args) {
		//멤버변수를 생성하려면 객체부터 생성해여 한다.
		Random rd = new Random();
		int num = rd.nextInt(); //int 최소, 최대값을 랜덤으로 가져온다.
		System.out.println(num);
		
		num = rd.nextInt(5); //0부터 5미만의 값을 랜덤으로 가져온다. 
		System.out.println(num);
		
		
	}
}
