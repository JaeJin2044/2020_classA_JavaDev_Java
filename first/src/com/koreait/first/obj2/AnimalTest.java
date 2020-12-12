package com.koreait.first.obj2;

public class AnimalTest {

	public static void main(String[] args) {
							// () : 생성자 라고 불린다.
		Animal animal_1 = new Animal();				//	A
		//기본 생성자는 자동으로 넣어줌 .. (아무것도 없을 때 )
		// 하나라도 있다면 생성자를 작성 해야함.
		
		// # 생성자 작성 규칙
		// 생성자의 이름은 클래스 이름과 똑같아야함
		// return타입이 없어야함. 
		
//		animal_1.name = "바둑이";
//		animal_1.age = 2;
//		
		animal_1.crying();
		
// ====================================================		
		
		Animal animal_2 = new Animal("나비",4);		// B
		animal_2.crying();
		
		
		Animal animal_3 = new Animal("달미");		// C
		animal_3.crying();
		
		Animal animal_4 = new Animal(4);			// D 
		animal_4.crying();
		
		
		
		

	}

}
