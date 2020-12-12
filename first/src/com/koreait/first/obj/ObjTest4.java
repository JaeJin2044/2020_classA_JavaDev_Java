package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest4 {

	public static void main(String[] args) {
		int[] arr = {4,7,1,9,3};
		
		int[] arr3 = arr; //얕은 복사 칭한다.
		
	
		//배열 복사하는 메소드(깊은복사);
		int[] arr2 = copyArr(arr);
		
		orderBy(arr2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

	public static void orderBy(int[] arr) {

		Arrays.sort(arr);
	}
	
	public static int[] copyArr(int[] arr) {
		//주소 값이 다른 새로운 배열을 생성 
		int[] arr2 = new int[arr.length];
		//파라미터값으로 들어온 배열의 값을 새로운 배열에 값을 넣는다.
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i];
		}  
		return arr2;
	}


}
