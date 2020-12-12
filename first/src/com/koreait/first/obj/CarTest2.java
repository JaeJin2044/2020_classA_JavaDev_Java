package com.koreait.first.obj;

public class CarTest2 {

	public static void main(String[] args) {

		// Stack 메모리 영역   
		// LIFO 후입선출 
		// Car car1할당  
		// Car car1 = "주소값"
		
		// Heap 메모리 영역 
		// FIFO 선입 선출 
		// new Car(); ==> Heap 메모리 영역에 할당  , 주소값은 아무도 모른다 ..
		// Car car1이 new Car()을 가리킨다.. 라고 이해 
		
		
		Car car1 = new Car();
		car1.name = "페라리";
		car1.cc = 5000;
		car1.color = "붉은색 ";
		
		
		Car car2 = new Car();
		car2.name = "포르쉐";
		car2.cc = car1.cc;
		car2.color = car1.color;
		
		//이렇게 하면 true가 나온다. 
	
		car1=car2;
		System.out.println(car1==car2);
		
		car2.name = "쏘나타";
		
		car1.drive();
		car2.drive();
		// 안에 값이 같더라도 주소값이 다르다 ...
		// "=="는 레퍼런수 변수에서는 무조건 주소 값 비교이다.

	}

}
