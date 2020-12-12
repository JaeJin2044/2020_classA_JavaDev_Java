package com.koreait.first.obj3;

public class ClassA {
	//멤버 필드  ==> 값 넣는 방법 ? (1)생성자  , (2)세터메소드
	private String name;
	private int age;
	
	//생성자 
	//리턴타입이 없고 ,, 클래스 명이랑 이름이 같아야함.
	//객체 생성 될때 딱 한번만 사용 
	
	public ClassA(String a , int b) {
		System.out.println("ClassA  생성자");
		this.name = a;
		this.age = b;
	}
	
	
	//메소드 
	public void print() {
		System.out.println("A : " +name+","+age);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}
