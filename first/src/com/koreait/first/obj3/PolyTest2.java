package com.koreait.first.obj3;

public class PolyTest2 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B",20);
		ClassA ca = cb;
		
		Object obj =ca;
		ca.print();
		
		
	// 오류발생 ClassC cc = (ClassC)obj;
	//ClassC타입 으로는 상위 객체를 가리 킬 수 X

		
		
		
		
		
		
		
		

	}

}
