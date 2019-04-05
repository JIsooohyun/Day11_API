package com.sh.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		
		System.out.println("종료시간을 입력하세요");
		String time = sc.next();   //3-50
		
		String [] times = time.split("-");
		
		end.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[0]));
		end.set(Calendar.MINUTE, Integer.parseInt(times[1]));
		
		long inTime = start.getTimeInMillis();
		long outTime = end.getTimeInMillis();
		long result = outTime - inTime;
		long h = result/(1000*60*60); //시간 완성~
		long m = result%(1000*60*60);
		
		if(m>0) {
			h++;
		}
		
		System.out.println("최종 요금 : "+h*1000);
		
		
	}
}
