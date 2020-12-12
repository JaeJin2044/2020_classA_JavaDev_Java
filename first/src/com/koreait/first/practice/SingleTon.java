package com.koreait.first.practice;

public class SingleTon {
	private static SingleTon singleton ;
	private int a ;
	
	
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	

	private SingleTon() {
		
	}
	
	public static SingleTon getSingleTon() {
		if(singleton == null) {
			singleton = new SingleTon();
		}
		
		return singleton;
	}

	
	
	
	
	

}
