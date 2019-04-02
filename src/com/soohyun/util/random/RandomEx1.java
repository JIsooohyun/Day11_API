package com.soohyun.util.random;

import java.util.Random;

public class RandomEx1 {
	public void ex4() {
		//RPG

		//10%확률로 2단계 성공  1/10
		//20%확률로 1단계 성공  2/10 -> 1/5
		//70%확률로 실패           7/10
		Random rd = new Random();
		int [] nums = {0, 0, 0, 1, 0, 2, 0, 1, 0, 0};
		int index = rd.nextInt(nums.length);
		int num = nums[index];

		if(num == 0) {
			System.out.println("실패");
		}else {
			System.out.println(num+"단계 성공");
		}

		/*
		int num = rd.nextInt(100);
		if(rd.nextInt(100)<10) {
			System.out.println("1단계");
		}else if(rd.nextInt(100)<20) {
			System.out.println("2단계");
		}else {
			System.out.println("실패");
		}
		내가 한 부분
		 */


	}

	public void ex3() {
		String [] foods = {"떡볶이", "냉면", "순대국", "육개장", "해장국", "굶기"};
		Random rd = new Random();
		//배열이랑 랜덤값 무작위로 뽑기
		int num = rd.nextInt(foods.length);
		System.out.println(foods[num]);		

	}


	public void ex2() {
		//1~45번까지의 숫자를 6개
		int [] lotto = new int[6];
		Random rd = new Random();
		int i, j;

		for(i=0; i<10; i++) {
			int num = rd.nextInt(45)+1;
			int num2 = rd.nextInt(45)+1;
			lotto[i] = num;
			lotto[i+1] = num2;
			
			if(lotto[i] == lotto[i+1]) {
				System.out.println("다시 입력");
				
			}
		}
	}


	public void ex1() {
		//6개 숫자 출력이 되면 된다~
		//1부터 45번까지
		Random rd = new Random();
		int num;
		for(int i=0; i<6; i++) {
			num = rd.nextInt(45);
			System.out.println(num+1);
		}
		
	}

	public static void main(String[] args) {
		new RandomEx1().ex2();
	}


}
