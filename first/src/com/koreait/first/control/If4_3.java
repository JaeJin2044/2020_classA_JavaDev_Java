package com.koreait.first.control;

import java.util.Scanner;

public class If4_3 {
	
	public static void main(String[] args) {
		
		// 남 평균키 : 165 , 여 평균키 : 157
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성별을 입력하세요(남/여):");
		String gender = sc.next();
		
		System.out.print("키를 입력해주세요:");
		int height = sc.nextInt();
	
		
		//null인상태는 절대로 호출 할 수 없다 .
		//소스는 한번에 수정할 수 있도록 짜는 것이 좋다 .. ==> 매직넘버 라고 부름
		
		int avgHeight = 0;
		
		//변수를 사용할때 변수를 초기화 시켜 줘야 한다 .
		
		if("남".equals(gender) ||"man".equals(gender) || "남자".equals(gender)) {
			avgHeight = 165;
			
		} else if("여".equals(gender) ||"woman".equals(gender) || "여자".equals(gender)) {
			avgHeight = 157;
		}

		// 만약 else로 avgHeight의 값이 무조건 초기화 할수 있도록 else로 표현하였다면 에러가 뜨지 않는다 ...
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
