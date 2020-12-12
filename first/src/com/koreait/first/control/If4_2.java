package com.koreait.first.control;

import java.util.Scanner;

public class If4_2 {
	
	public static void main(String[] args) {
		
		// 남 평균키 : 165 , 여 평균키 : 157
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(남/여):");
		String gender = sc.next();
		
		System.out.print("키를 입력해주세요:");
		int height = sc.nextInt();
		
		// 소스는 한번에 수정할 수 있도록 짜는 것이 좋다 .. ==> 매직넘버 라고 부름
		
		int avgHeight = 0;
		boolean b1 = true;
		
		if(gender.equals("남자")) {
			b1 = true;
		}else if(gender.equals("남")) {
			b1= true;
		}else if(gender.equals("man")) {
			b1= true;
		}
		
		
		if(gender.equals("여자")) {
			b1 = false;
		}else if(gender.equals("여")) {
			b1= false;
		}else if(gender.equals("woman")) {
			b1= false;
		}
		
		
		if(b1 == true) {
			avgHeight = 165;
			
		} else if(b1 ==false) {
			avgHeight = 157;
		}

		
		if(height > avgHeight) {
			System.out.println("평균키  초과입니다.");
		}
		else if(height == avgHeight) {
			System.out.println("평균키 입니다.");
		}
		else {
			System.out.println("평균키 미만 입니다.");
		}
	

		
		
		
		
		

	}

}
