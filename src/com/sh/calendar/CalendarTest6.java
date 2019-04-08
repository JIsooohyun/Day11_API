package com.sh.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest6 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		
		//2019년 4월 8일
		//int year = ca.get(Calendar.YEAR);
		//System.out.println(year+"년");
		
		String pattern = "yyyy년 MM월 dd일 HH:mm E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		long now = ca.getTimeInMillis(); //현재시간을 MillSecond로 준다.
		//첫번째 방법 : Date date = new Date();  //현재시간
		//첫번째 방법 : date.setTime(now);
		
		//두번째 방법 :Date  date = new Date(now);
		
		Date date = ca.getTime();
		String result = sd.format(date);  //java.util.Date이 들어가야한다. 
		System.out.println(result);
	}

}
