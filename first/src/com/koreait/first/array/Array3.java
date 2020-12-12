package com.koreait.first.array;

public class Array3 {

	public static void main(String[] args) {
		int[] iArr = {20,11,34,99,13,15,87,12}; //배열을 바로 초기화 할 수도 있음..
		
		//배열의 값들중 홀수만 출력하는 for문 
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] % 2 != 0) {
				System.out.println(iArr[i]);
			}	
		}
		
		
		
		
		
		
	}
}
