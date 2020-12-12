package com.koreait.first.obj3;

public class ClassC extends ClassB {

	public ClassC(String a, int b) {
		super(a, b);
	}
	

	@Override
	public void print() {
		System.out.println("C : "+getName()+"-"+getAge());
	}
	

}
