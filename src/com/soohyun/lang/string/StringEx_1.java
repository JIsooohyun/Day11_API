package com.soohyun.lang.string;

import java.util.Scanner;

public class StringEx_1 {
	
	public StringEx_1(){
		Scanner sc = new Scanner(System.in);
	}


	//ex1
	//주민번호 입력  991224-1234567
	//남자? 여자 인지 판별하기
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();

		char ch = jumin.charAt(7);
		System.out.println(ch);

		if(ch == '1') {
			System.out.println("남자");
		}else if(ch == '2') {
			System.out.println("여자");
		}else {
			System.out.println("다른년생");
		}


	}


	public void ex2() {
		String name = "Mississippi";
		//i글자가 몇개 있습니까?
		int i=-1;//인덱스번호를 담음
		int count=0;
		while(true) {
			i = name.indexOf("s", i+1); //i가 -1이 나올때까지 
			if(i!=-1) {
				count=count+1;
			}else {
				break;
			}
		}
		System.out.println(count);
	}

	public void ex3() {
		Scanner sc = new Scanner(System.in);
		//문자열을 입력받고
		//한글자당 100원 받음 돈계산해라
		String str = sc.next();
		int money = str.length();
		System.out.println("총 가격은 : "+money*100);

	}


	public void ex4() {
		//id입력 최대 10글자 이하로만 받아라 
		//id를 이메일 형식으로 받아라

		Scanner sc = new Scanner(System.in);
		boolean check1 = false; //id의 길이가 맞는지 여부
		boolean check2 = false;  //이메일 형식 여부

		System.out.println("ID를 입력하세요");
		String id = sc.next();
		if(id.length()<11) {
			check1 =! check1;
		}
		int index = id.indexOf("@");
		if(index != -1) {
			check2 = ! check2;
		}
		if(check1 && check2) {
			System.out.println("쓸 수 있는 ID입니다.");
		}else {
			System.out.println("글자수는 10글자 이하, 형식은 이메일 형식을 지켜주세요");
		}
	}

	public void ex5() {
		//jpg, png, gif, jpeg
		//tes.abc.gif
		//업로드 할 파일명을 입력
		//파일이 이미지 파일인지 아닌지 판다.
		//이미지가 아니라면 이미지만 가능합니다 라고 
		Scanner sc = new Scanner(System.in);

		
		
		//선생님이 코딩한 부분
		String name = sc.next();
		int i = name.indexOf(".");
		String result = name.substring(i+1);
		System.out.println(result);
		
		String name2 = sc.next();
		int j = name2.lastIndexOf(".");  //뒤에서부터 찾기
		String result2 = name2.substring(j+1);
		System.out.println(result2);
		
		
		/*내가 코딩한 부분
		System.out.println("파일명을 입력하세요");
		String name = sc.next();
		int index = name.indexOf(".");  //.의 인덱스 번호를 찾아준다. 
		int index1 = name.indexOf(".", index+1);
		//System.out.println(index1);
		String str = name.substring(index1, name.length());  //인덱스의 번호부터 end까지 값을 반환시킨다.
		System.out.println(str);
		if(index1 == -1) {
			str = name.substring(index, name.length());
			if(str.equals(".png") || str.equals(".jpg") || str.equals(".gif") || str.equals(".jpeg")) {
				System.out.println("이미지 파일입니다.");
			}else {
				System.out.println("이미지 파일을 올려주세요");
			}
		}else {
			str = name.substring(index1, name.length());
			if(str.equals(".png") || str.equals(".jpg") || str.equals(".gif") || str.equals(".jpeg")) {
				System.out.println("이미지 파일입니다.");
			}else {
				System.out.println("이미지 파일을 올려주세요");
			}
		}*/
	}
	
	public void ex6() {
		
	}

}














