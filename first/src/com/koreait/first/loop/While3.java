package com.koreait.first.loop;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		//입력 받은 변수값들의 합 
		int result = 0;
		
		//입력 받는 변수 
		int val = 0; 
		
		do {
			System.out.print("숫자를 입력하세요(종료0): ");
			val = sc.nextInt();
			result += val;
			
		}while(val!=0);	//0을 입력할시 반복문 종료 
		
		System.out.println("합계: "+result);
		
		//while 과 do while의 차이는 최초의 문장을 실행 하냐 안하냐의 차이일뿐 나머지는 동일 하다.
		
		sc.close();
		
		
	}

}
