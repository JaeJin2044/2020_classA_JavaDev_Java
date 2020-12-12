package com.koreait.first.obj2;

public class InheriTest2 {

	public static void main(String[] args) {
		ClassC cC = new ClassC("김남길",22);
		System.out.println(cC.getName());
		System.out.println(cC.getAge());
		
		
		System.out.println("=======================");
		ClassD cD = new ClassD();
		
		System.out.println(cD.getName());
		System.out.println(cD.getAge());
		
		
		// 클래스 형변환(형식)
		// ClassD cD = (ClassD) cA;
		
		
	}

}
