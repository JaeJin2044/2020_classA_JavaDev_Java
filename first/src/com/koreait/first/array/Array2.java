package com.koreait.first.array;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// 메소드는 최소한의 역할로 만들어야한다..
		// 그래야 재활용성이 높다 
		
		
		int[] iArr = new int[20];
		
		
		int sum = 0;
		
		//배열안에 값을 저장하는 for문
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		//배열안의 값을 전부 합하는 for문
		for (int i = 0; i < iArr.length; i++) {
			sum +=iArr[i];
		}
		
		
		
		
		//배열안의 값을 출력하는 for문 
		for(int i =0; i<iArr.length; i++) {			
			System.out.printf("%d: %d\n",i,iArr[i]);		
			// i값은 인덱스 값 ...    iArr[i]은 배열안에 들어 있는 값 
		}
		
		System.out.println("배열의 총합: "+sum);
		
		
		
		// System.out.println(Arrays.toString(iArr)); 
		// 배열안의 값들을 전부 출력
		
	
		
		
		
	}

}
