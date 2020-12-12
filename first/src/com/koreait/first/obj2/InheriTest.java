package com.koreait.first.obj2;

public class InheriTest {

	public static void main(String[] args) {
		ClassA cA = new ClassA();
		//cA.print(); // 불가능
		//cA.setAge(10); // 불가능
		cA.setName("홍길동");	//가능
		
		
		ClassB cB = new ClassB();
		//cB.print(); 불가능
		cB.setAge(10);
		cB.setName("김남길");
		
		
		ClassC cC = new ClassC();
	
		cC.setName("윤두준");
		cC.setAge(20);
		cC.print();
		
	}

}
