package com.koreait.first.obj;

public class CarTest {

	public static void main(String[] args) {
		// 클래스는 설계도 이며 문서이다 .
		// 설계도를 기반으로 무언가를 만들면 실체가 된다 .
		// 실체를 "인스턴스"라고 함.(객체화)
		
		// 객체란 무엇인가?
		// 객체는 멤버 필드와 멤버 메소드로 이루어져 있음
		// 실체화 된것
		
		// 객체화 방법 -> 객체화 하면 메모리에 어딘가에 위치함.
		// car1은 어딘가에 위치하는지에 대한 주소값을 저장하고 있음.
		// 대문자로 시작하는 변수타입은 주소값이 저장된다 .
		// Car라는 문서를 객체화 하고  car1은 주소값을 저장한다.
		Car car1 = new Car();
		car1.name = "페라리";
		car1.cc = 5000;
		car1.color = "붉은색 ";
		
		car1.drive();
		
		Car car2 = new Car();
		car2.name = "포르쉐";
		car2.cc = 3500;
		car2.color = "블랙 ";
		
		car2.drive();
		
		//레퍼런스 변수 끼리의 ==은 주소값 비교이다..  주소값이 같으면 true / 다르면 false 
		System.out.println(car1 == car2);
		
		
		
		
		
		
	}

}
