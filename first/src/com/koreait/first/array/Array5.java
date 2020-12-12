package com.koreait.first.array;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		// 선택 정렬 
		
		int[] iArr1 = {14,7,59,7,32,64,3};

		

		for (int i = 0; i < iArr1.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < iArr1.length; j++) {
				if (iArr1[min] > iArr1[j]) {  // 자리 바꾸기 
					min = j;
				}
			}
			
			if( i != min) {
				int temp = iArr1[min];
				iArr1[min] = iArr1[i];
				iArr1[i] = temp;
			}
			
		}
		
		System.out.println(Arrays.toString(iArr1));

	}
}
