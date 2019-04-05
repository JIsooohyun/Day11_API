package com.sh.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		
		ca.set(2019, 3, 1);
		int max = ca.getActualMaximum(Calendar.DATE);
		//System.out.println(max);
		int d1 = ca.DATE;
		
		int week = ca.get(Calendar.DAY_OF_WEEK)-1;
		//다 대문자로 표시되어 있으면 앞에 final이 붙어 있다. 
		
		
		
		
		System.out.print("일\t월\t화\t수\t목\t금\t토");
		System.out.println();

		for(int i=0; i<week; i++) {
			System.out.print("\t");
		} //공백나타낸 부분
		
		for(int i=1; i<=max; i++) {
			System.out.print(i+"\t");
			
			
			if((i+week)%7 ==0) {
				System.out.println();
			}	
		}//for문
		
		System.out.println();
		System.out.println("YEAR : "+Calendar.YEAR);
		System.out.println("MONTH : "+Calendar.MONTH);
		System.out.println("DATE : "+Calendar.DATE);
		
		System.out.println(ca.getTime());
	}
}



























