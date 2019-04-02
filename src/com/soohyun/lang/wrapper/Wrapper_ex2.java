package com.soohyun.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {

	private Scanner sc ;
	public Wrapper_ex2() {
		sc = new Scanner(System.in);
	}
	public void ex1() {
		//1.주민등록번호 입력 941226-1234567
		//마지막 번호는 체크용 번호로 따로 저장
		// 9 4 1 2 2 6 - 1 2 3 4 5 6 7 
		//*2 3 4 5 6 7   8 9 2 3 4 5 
		//19+12+4+10+....
		//합산한 결과를 11로 나눈 나머지를 구하기. 
		//나머지를 11로 뺀다. (11-나머지)
		//그 값을 체크용이랑 비교해서 같으면 정상적인 번호 아니면 OK
		//(11-나머지)가 두자리면 10으로 나눈 나머지를 체크번호랑 비교

		System.out.println("주민등록번호를 입력하세요");
		String jumin = sc.next();
		char cut; //주민번호 하나씩 짤라줌
		String multi; 
		int mulhap=0; //주민등록번호 숫자로 변환
		
		int hap=0; //총 더한값
		int j=2; //곱하는 숫자 증가부분
		int rem =0; //나머지 부분
		
		
		char end;
		String end1;
		int end2;
		
		for(int i=0; i<jumin.length()-1; i++) {
			cut = jumin.charAt(i);
			//System.out.println(cut);
			if(!Character.isDigit(cut)) {
				continue;
				//숫자가 아니면 증감식으로 올라간다.
			}
			if(Character.isDigit(cut) == true) {
				//Integer.paseInt(String.valueOf(cut));
				multi = Character.toString(cut);
				mulhap =Integer.parseInt(multi);
				hap = hap+(mulhap*j);
				j++;
				if(j>9) {
					j=2;
				}
			}
		}//for문의 끝부분

		//하나로 줄 일 수 있다. 
		//Integer.paseInt(String.valueOf(cut));
		end =jumin.charAt(13);
		end1 = Character.toString(end);
		end2 = Integer.parseInt(end1); //끝자리


		rem = hap%11;//11로 나눈 나머지
		
		int result = 11-rem;
		if(result>=10) {

			result = result%10;
		}else {
			result = 11-rem;
		}

		if(result ==  end2) {
			System.out.println("정상적인 주민등록번호입니다.");
		}else {
			System.out.println("이상하다~");
		}
	}

}


