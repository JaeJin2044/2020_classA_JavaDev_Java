package com.koreait.first.method;

public class MethodGugudan {

	public static void main(String[] args) {
		gugudan(3,5);

	}
	
	public static void gugudan(int n1) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", n1, i, (n1 * i));
		}
		System.out.println("===============================");
	}
	
	// n1 부터 n2 까지의 구구단 출력 메서드 (파라미터 2개 )
	public static void gugudan(int n1, int n2) {
		for(int j= n1; j<=n2; j++) {
				gugudan(j);
				
			}
		}
		
}
