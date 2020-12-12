package com.koreait.first.control;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//남 165 , 여 157
		System.out.print("성별을 입력하세요(남/여):");
		String gender = sc.next();
		
		int height = 0;
		int avgHeight =0;
		
		
		
		//switch문은 문자열비교시 사용하는 것이 좋다 !!
		switch(gender) {
		case "남자":
		case "남":
		case "man":
			avgHeight = 165;
			break;
		case "여자":
		case "여":
		case "woman":
			avgHeight = 157;
			break;
		default:
			System.out.println("잘못입력 했으니 다시 입력 해주세요 ");
			break;
		}
		
		
		if(avgHeight > 0) {
			System.out.print("키를 입력해주세요:");
			height = sc.nextInt();
			
			if(height > avgHeight ) {
				System.out.println("평균키  초과입니다.");
			}
			else if(height == avgHeight ) {
				System.out.println("평균키 입니다.");
			}
			else  {
				System.out.println(" 평균키 미만 입니다.");
			}
			
		}
		sc.close();
		
		
	
	
		
	}

}








