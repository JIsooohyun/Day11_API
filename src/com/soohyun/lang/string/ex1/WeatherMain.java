package com.soohyun.lang.string.ex1;

public class WeatherMain {

	public static void main(String[] args) {

		WeatherInit init = new WeatherInit();
		
		Weather [] weathers= init.getWhethers();
		for(int i=0; i<weathers.length; i++) {
			System.out.println("city : "+weathers[i].getCity());
			System.out.println("state : "+weathers[i].getState());
			
		}
	}

}
