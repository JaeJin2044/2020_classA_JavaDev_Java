package com.koreait.first.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		//숫자를 입력하세요(종료:0) : ?

		
		//break 없이 만들기 !!
		Scanner sc =  new Scanner(System.in);
		System.out.printf("숫자를 입력하세요(종료:0):");
		int input_num = sc.nextInt();
		int result = 0; 
		
		while(input_num !=0) {
			result += input_num;
			System.out.printf("숫자를 입력하세요(종료:0):");
			input_num = sc.nextInt();
		
		}
		System.out.println("합계 : "+result);
			
		
		
	}

}
