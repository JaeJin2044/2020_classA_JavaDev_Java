package com.koreait.first.inter;

//인터페이스는 다중 구현 가능 
public class InterFatherClass implements InterParent, InterGrand{

	@Override
	public void print() {
		System.out.println("Hi I'm your father. - print()");
		
	}
	

}
