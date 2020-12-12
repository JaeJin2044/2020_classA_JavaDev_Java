package com.koreait.first.obj;

public class StaticTest1 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.country = "korea";
		
		tv1.brand = "Samsung";
		tv1.inch = 50;
		
		tv1.printMe();
		
		Tv tv2 = new Tv();
		tv2.country = "USA";
		tv2.brand = "Apple";
		tv2.inch = 40;
		
		Tv.country = "France";   // static 은 사실 이런식으로 사용 
		tv2.printMe();
		tv1.printMe();
		
		// static은  멤버 필드 , 메소드 앞에 붙일 수 있음
		// static 과 비static은 계급이 다르다 ..
		// 무조건 1개만 만들어짐.
		// 500개를 만들어도  변수 country 1개만 가리키고 있다 .
		// 인스턴스화 시키지 않아도 사용 가능.
		
		
		// #멤버 필드
		// -> 자바는 모든소스는 클래스 안에 있어야 한다.
		// -> static을 붙이면 1개가 된다.
		// -> 무조건 1개의 값만 저장함.
		// -> 객체와 노상관 ..인스턴스화 시키지 않아도 사용 가능 
		// 클래스 변수(static변수) 클래스명.() 이렇게 접근 하는것  , 인스턴스 변수(객체화 하여 사용)
		
		
	}

}

class Tv{
	static String country;
	String brand;
	int inch;
	
	// #static이 붙지 않은 멤버 필드를 메서드에서 사용하려고 할때 static을 메소드 앞에 붙일 수 없음.
	void printMe() {
		System.out.printf("%s나라의 %s회사의 %d인치 Tv입니다.\n",country,brand,inch);
	}
	
	static String whereCountry() {
		return country;
	}
	
	static int sum (int n1, int n2){
		return n1+ n2 ;
	}
	
}
