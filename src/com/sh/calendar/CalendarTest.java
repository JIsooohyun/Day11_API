package com.sh.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {

		//추상클래스 new 생성하면 안된다. 
		//현재 시간을 담고 있다. 
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		//특정한 날짜 데이터를 꺼낼 때, get을 사용
		//static이 안붙어 있으니까 멤버변수
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int min = calendar.get(Calendar.MINUTE);
		System.out.println(min);
		
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month+1);
		
		calendar.set(Calendar.YEAR, 2100);
		System.out.println(calendar.get(Calendar.YEAR));
	
		//4월 -> 1월  달은 1월이 0으로 시작한다. 
		calendar.set(Calendar.MONTH, 0);
		System.out.println(calendar.get(Calendar.MONTH));
		
		calendar.set(Calendar.HOUR_OF_DAY, 22);
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY ));
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
	}

}
