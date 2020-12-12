package com.koreait.first.obj4;

public class PolyTest3 {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
	
		Animal ani = new Animal();
		//instanceof 형 변환 가능 하면 true , 불가능하면 false
		//좌측이 우측으로 형변환 가능 한가?
		System.out.println(ani instanceof Dog);
		
		System.out.println("===================================");
		
		
		polyCry(bird);
		polyCry(dog);
		polyCry(cat);

	}
	public static void polyCry(Animal ani) { 
		
		ani.crying();
		
		if(ani instanceof Dog) {
			// Dog dog = (Dog)ani;
			// dog.shakeTail();
			((Dog)ani).shakeTail();
		} 
		
		//만약 Dog클래스가 가지고 있는 shakeTail()을 사용 하고 싶을때...
		
		
	}

}



