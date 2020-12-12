package com.koreait.first.obj3;

public class OverrideTest2 {

	public static void main(String[] args) {
		
		// #다형성 
		// - 여러가지 형태가 될수 있는 성질
		
		// 1. 부모 타입은 자식 객체 주소값을 참조 할 수 있다.(가리킬 수 있다.)(자식 객체 주소값 저장 o)
		// Ex)
		ClassA ca  = new ClassB("B", 20);
		
		// 2.자식  타입은 부모 객체 주소값을 참조 할 수 없다(가리킬수 x)(부모객체 주소값저장 x)
		// Ex) - 오류 발생 
		//	ClassB cb = new ClassA("A",10);
		
		// 3. 타입은 메소드를 호출할 수 있냐 없냐만 결정
		// - (즉, 자기가 알고 있는 메소드만 호출 할 수 있다.)
		// - 실제로 실행되는 메소드는 객체 기준이다.
		ca.print();
		//ca.drive(); <=== 호출 불가능 !!! ClassA가 이걸 모른다.
		// ClassB는 drive() 메소드를 가지고 있음...
		
		//다운 캐스팅
		ClassB cb = (ClassB)ca;
		cb.drive();
		
		System.out.println("---");
		ClassA ca2 = cb;
		ca2.print();
		
		
		
		
		

		
	}
}
