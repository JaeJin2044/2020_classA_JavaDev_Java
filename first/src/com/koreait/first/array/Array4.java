package com.koreait.first.array;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		
		// 버블 정렬 
		
		
		int[] iArr = {15,9,4,7,5,1,3,0};
		
		int tmp = 0;
		
		// 총 5번 for문을 돌려 줘야 하기 때문에 배열의 조건식에 배열의 길이를 설정 ... 
		for (int i = 0; i < iArr.length; i++) {	
			//여기서 제일 뒤에 인덱스 까지 가야하기 때문에 길이에다가 -1을 해준다 . 해주지 않는다면 배열의 인덱스 범위를 초과함.
			for (int j = 0; j < iArr.length-1; j++) {  
				if(iArr[j] > iArr[j+1]) {
					tmp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = tmp;
					Arrays.toString(iArr);
				}
			}
			System.out.println(Arrays.toString(iArr));
		}	
			
	
		
		
		for (int i = 0; i < iArr.length; i++) {
			System.out.printf(iArr[i]+",");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
