package com.koreait.first.inter;

public interface InterChild extends InterParent{

	// 인터페이스는 추상클래스와 마찬가지로 구현부가 없기 때문에 객체화가 되지 않는다.
	//상속 받고 추가적으로 추상메소드를 추가 할 수 있다.
	void bark();

}
