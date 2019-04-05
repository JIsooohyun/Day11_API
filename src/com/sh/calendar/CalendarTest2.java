package com.sh.calendar;

import java.util.Calendar;

public class CalendarTest2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//내 생일 세팅
		//내가 태어난 요일이 무슨 요일
		
		cal.set(1997, 1, 12);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		cal = Calendar.getInstance();
		int d = cal.get(Calendar.DATE)+3;
		cal.set(Calendar.DATE, d);
		System.out.println(cal.get(Calendar.DATE));
		cal = Calendar.getInstance();
		System.out.println("Month : "+cal.get(Calendar.MONTH));
		
		
		cal.roll(Calendar.DATE, 28);
		
		System.out.println("Month : "+cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));

		
	}
}
