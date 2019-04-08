package com.sh.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest7 {

	public static void main(String[] args) throws ParseException {

		String now = "2020-05-05";
		//문자열 -> Calendar로 바꾸기 !!
		
		//calendar를 문자열에서 날짜로 바꿔주는 것이 없어서
		//java.text.Simple -> simpleDateFormat에서는 있다.
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = sd.parse(now);
		System.out.println(date);
		 
		//date타입을 Calendar타입으로 바꿔주기!
		Calendar ca = Calendar.getInstance();
		ca.setTime(date);
		
		System.out.println(ca.get(Calendar.MONTH));
		
		
		
		
	}

}
