package com.soohyun.util.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest_1 {

	public static void main(String[] args) {
		
		int [] ar = new int[3];
		String [] s = new String[3];
		Random r =new Random();
		s[0]="test";
		s[1]="zoo";
		s[2]="apple";
		for(int i=0; i<ar.length; i++) {
			ar[i]=r.nextInt(45)+1;
			System.out.println(ar[i]);
		}
		
		System.out.println("=====================");
		//static이 붙어있으니까 클래스명으로 시작 해당 API
		Arrays.sort(ar);
		Arrays.sort(s);
		
		for(int i=0; i<ar.length; i++) {
			//System.out.println(ar[i]);
			System.out.println(s[i]); //오름차순 정렬
		}
		
	}

}
