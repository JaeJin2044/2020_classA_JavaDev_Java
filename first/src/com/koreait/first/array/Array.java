package com.koreait.first.array;

public class Array {

	public static void main(String[] args) {
		
		
		// 정수형이든 실수형이든 숫자형은 default값이 0으로 되어 있음
		
		int[] iArr = new int[90];	//정수형 배열 
		// iArr.length = 200; 	// length 상수 값이라서 변경 불가능 ..   바꿀려면 초기화 값을 바꿔야 함.
		// iArr.length만 속성이다 .. 나머지는 기능임!!!
		
		System.out.println("배열 iArr의 길이: "+(iArr.length));
		
		iArr[0] = 100;
		int n1 = 100;
		
		System.out.println(n1);
		System.out.println(iArr[0]);
		
		float[] fArr = new float[10];	//실수형 배열
		fArr[0] = 10.1f;
		System.out.println(fArr[2]);
		
		
		String[] sArr = new String[10];	//문자형 배열 (레퍼런스변수) default 값이 null임
		System.out.println(sArr[0]);
		
		String str = "안녕";
		
		

		
		
		
		
		
		
		

	}

}
