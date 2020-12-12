package com.koreait.first.obj;

public class StaticTest2 {

	public static void main(String[] args) {
		// n1 = 22, n2 = 55;
		
		
		// case1 (인스턴스화 하여 값을 설정후 sum함수를 통해 출력) 
		InstCalc inc = new InstCalc();
		inc.n1 = 22;
		inc.n2 = 55;
		System.out.println("InstCalc클래스의 n1+n2의 값: "+inc.sum());
		
		
		// case2 (클래스 StatCalc의 static sum()함수를 통해 바로 접근하여 값을 출력)
		System.out.println("StatClac클래스의 n1+n2의 값: "+StatCalc.sum(22, 55));
		
		
		// case1 과 case2 의 접근 하는 방식과 , 값을 설정할 때의 차이를 인지하자 !!!
		
		

	}

}

class InstCalc {
	int n1;
	int n2;

	int sum() {
		return n1 + n2;
	}
}

class StatCalc {
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}