package com.koreait.first.obj2;

public class CapsuleTest {

	public static void main(String[] args) {

		// # 접근 지시어
		// private, default, protected, public

		// (1) private : 같은 class 접근 O

		// (오류발생)
		// Animal2 ani2 = new Animal2();
		// ani2.name = "dddd";

		// (2) default : 같은 class, 같은 package 접근 O
		//
		// Animal2 ani2 = new Animal2();
		// ani2.name = "dddd"; (오류발생)
		// ani2.age = 5; (오류 발생x)

		// (3) protected : class, package, 상속관계(패키지가 다르더라도) 접근 O

		// (4) public : ALL

		// class 앞에는 public , default 만 가능 ..

		// #문자열 길이
		// 문자열.length();
		
		Animal2 ani2 = new Animal2();
		ani2.setAge(10);
		ani2.setName("철철이");
		ani2.crying();
		
		String ani2Name = ani2.getName();
		System.out.println(ani2Name);
		
		
		
	}

}
