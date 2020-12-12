package com.koreait.first.obj3;

public class PolyTest1 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B",10);
		
		//업 캐스팅 (형변환 따로 명시 해줄 필요 없음)
		ClassA ca = cb;
		ca.print();
		
		Object obj = ca;
		
		// 다운캐스팅
		// 부모클래스에서 자식클래스로 갈때는 형변환 필요 ..
		ClassA ca2 = (ClassA)obj;
		
		ClassB cb2 = (ClassB)ca2;
		cb2.drive();
		
	}
	
	
	
	
}
