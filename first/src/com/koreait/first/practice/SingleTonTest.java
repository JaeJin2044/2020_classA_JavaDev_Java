package com.koreait.first.practice;

public class SingleTonTest {

	public static void main(String[] args) {
	   // SingleTon singleton = new SingleTon();
		
		SingleTon.getSingleTon().setA(100);
		System.out.println(SingleTon.getSingleTon().getA());
		

	}

}
