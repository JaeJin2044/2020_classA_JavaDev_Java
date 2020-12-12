package com.koreait.first.control;


public class If3 {

	public static void main(String[] args) {
		
		 
		int score = 85;
	
		//그룹화 => 이중에서 하나만 실행됨 
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("D학점");
		}
		

	}

}
