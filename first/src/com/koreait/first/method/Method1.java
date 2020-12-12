package com.koreait.first.method;

public class Method1 {

	public static void main(String[] args) {
		
		// 한 메소드는 한 가지 기능만 하는게 좋다.
		
		// void : 리턴 타입
		// main : 메소드명 
		// () : 파라미터 
		
		sum(1,2);
		sum(10,20);
		sum(100,2500);
		
		sum(100,200,300);
		
		
		sum("값",10,20);
		
	}
	//void는 값을 주는게 아니라 ... 자기가 알아서 처리하고 던져준다.
	public static void sum (int n1, int n2) {
		System.out.println("숫자 2개 더하는 메소드");
		System.out.printf("%d + %d = %d\n",n1,n2,(n1+n2));
	}
	
	
	//	오버로딩(Overloading):   같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술 
	//	오버라이딩(Overriding):  상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용

	public static void sum (int n1, int n2,int n3) {
		System.out.println("이건 숫자 3개 더하는 메소드 ");
		System.out.printf("%d + %d + %d = %d\n",n1,n2,n3,(n1+n2));
	}
	

	public static void sum (int n1, int n2,String str) {
		
		System.out.printf("%s + %d + %d = %d\n",str,n1,n2,(n1+n2));
	}
	
	
	public static void sum (String str, int n1, int n2) {
		
		sum(str,n1,2);
	}
	
	//오버로딩은 파라미터와 연관성이 있다 ..
	
	
	
	
	
	
	
}








