package com.soohyun.util.sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class SortTest_3 {
	public static void main(String[] args) {
		Member member = new Member("choa", 24);
		System.out.println("객체주소 : "+member);
		
		Member member2 = new Member("choa", 20);
		System.out.println(member == member2);
		System.out.println(member.equals(member2));
		
		ArrayList<Member> ar = new ArrayList<Member>();
		Collections.sort(ar);
		
		//
	}
	
	public static void sort(List<Comparable<Object>> ar) {
		int num = ar.get(0).compareTo(ar.get(1));
		if(num>0) {
			
		}else if(num<0) {
			
		}else {
			
		}
	}
}
