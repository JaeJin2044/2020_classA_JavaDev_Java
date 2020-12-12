package com.koreait.first.method;

public class Method2 {

	public static void main(String[] args) {
		int r = sum(5,15);
		int sum = 50; 
		System.out.println("r : " + r);
	
	}
	
	
	// 비 void형은 return은 필수이다!!!!!
	public static int sum(int n1 , int n2) {
		int sum = n1+n2;
		return sum;
	}

	
	// 비 void형이 더 유연하다.
	// void형은 수정하기 비void형 보다 불편 하다 .
	
	// void형은 결국 호출하고 끝이난다.
	// void형은  찍는 틀을 어느 정도 정해놨기 때문에 재활용성이 좋지 않다.
	
}
