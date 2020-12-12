package com.koreait.first.obj2;

public class Animal {
	String name;
	int age;
	
	//
	public Animal() {
		this("바둑이");
		System.out.println("----Animal 기본 생성자()");
		
	}
	
	public Animal(String name) {
		this(name,2);
		
	}
	
	public Animal(int age) {
		this("바둑이",age);
		
	}
	

	public Animal(String name, int age) {
//		super(); // 생략 가능(나의 부모클래스의 생성자 호출)
		this.name = name;
		this.age = age;
	}
	
	void crying() {
		System.out.printf("%d살의 %s가 운다.\n",age,name); 
	}
	

}
