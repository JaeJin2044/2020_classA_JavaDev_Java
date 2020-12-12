package com.koreait.first.obj3;

public class ClassB extends ClassA {
	
	
	public ClassB(String a, int b) {
		super(a,b);
		
	}
	
	
	
	public void print() {
		//요렇게도 사용가능 부모의 프린트 호출/// super.print();
		System.out.println("B : "+getName()+"/"+getAge());
	}
	
	public void drive() {
		System.out.println("driving!!!");
	}
	
}
