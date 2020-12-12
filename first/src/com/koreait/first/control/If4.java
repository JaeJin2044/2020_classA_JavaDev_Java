package com.koreait.first.control;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		
		// 남 평균키 : 165 , 여 평균키 : 157
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(남/여):");
		String gender = sc.next();
		
		System.out.print("키를 입력해주세요:");
		int height = sc.nextInt();
		
		// 소스는 한번에 수정할 수 있도록 짜는 것이 좋다 .. ==> 매직넘버 라고 부름
		
		
		if(gender.equals("남")) {
			
			int avgHeight = 165;	//남자 평균키 설정
			if(height > avgHeight) {
				System.out.println("남자 평균키  초과입니다.");
			}
			else if(height == avgHeight) {
				System.out.println("남자 평균키 입니다.");
			}
			else {
				System.out.println("남자 평균키 미만 입니다.");
			}
		
		} else if(gender.equals("여")) {
			
			int avgHeight = 157;	//여자 평균키 설정
			if(height > avgHeight) {
				System.out.println("여자 평균키  초과입니다.");
			}
			else if(height == avgHeight) {
				System.out.println("여자 평균키 입니다.");
			}
			else {
				System.out.println("여자 평균키 미만 입니다.");
			}
		}
		sc.close();
		
		
		
		
		
		

	}

}
