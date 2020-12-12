package com.koreait.first.obj4;

public class Animal {
	
	void crying() {
		System.out.println("운다.");
	}
	
}

class Dog extends Animal{
	@Override
	void crying() {
		System.out.println("멍 ! 멍!");
	}
	
	void shakeTail() {
		System.out.println("살랑~ 살랑 ~~~");
	}
}


class Cat extends Animal{
	@Override
	void crying() {
		System.out.println("야옹~~  야옹 ~~~");
		
	}
}

class Bird extends Animal{
	
	@Override
	void crying() {
		System.out.println("짹 ~ 짹~~~");
	}
}









