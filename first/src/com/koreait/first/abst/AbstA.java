package com.koreait.first.abst;

// #tip 생성자를 private으로 만들면 클래스를 객체화 할 수 없음.
// 싱글톤 - 클래스를 객체 하나만 만들고 싶을때 사용하는 패턴 

//하나라도 abstract 가 있다면 클래스에abstract에 있어야한다.
//추상클래스는 객체화를 할 수가 없다.

public abstract class AbstA {
	int a = 10;
	int b = 20;
	
	//구현부 없이 메소드를 선언 할려면 abstract를 붙여야함.
	//오버라이딩을 무조건 해야함 
	public abstract void bark();
	
	
	//메소드의 선언부 
	public void print() {
		//메소드의 구현부 
		System.out.println("HI I`M A");
	}
	
}
