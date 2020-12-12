package com.koreait.first.abst;

public class AbstractTest {

	public static void main(String[] args) {
		AbstA aa = new AbstB();
		aa.bark();
		
		//다운캐스팅
		//AbstB ab = (AbstB)aa;
		//ab.shakeTail();
		
		//요렇게도 가능함.
		((AbstB)aa).shakeTail();
		System.out.println("===========================");
		
		AbstD ad = new AbstD();
		ad.print();
		ad.bark();
		ad.run();
		
		
		
		
		
	
		
	}

}
