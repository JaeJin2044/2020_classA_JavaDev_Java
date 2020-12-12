package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest3 {
	public static void main(String[] args) {
		
		int[] arr = {4,7,1,9,3};
		
		orderBy(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void orderBy(int[] arr) {
		
		Arrays.sort(arr);
		
	}

}
