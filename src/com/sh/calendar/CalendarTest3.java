package com.sh.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		
		//ca2.set(Calendar.MINUTE, 40);
		ca2.set(1997, 1, 12);
		long l =ca.getTimeInMillis(); //현재시간을 Mill로 바꾼것
		long l2 = ca2.getTimeInMillis();
		long l3 = l-l2;
		//System.out.println(l/(1000*60*60*24));
		//System.out.println(l2);
		System.out.println(l3/(1000*60*60*24));
	}

}
