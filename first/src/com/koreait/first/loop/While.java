package com.koreait.first.loop;

public class While {

	public static void main(String[] args) {
		
		//for문은 어느 정도 범위가 있을 떄 주로 사용 
		for(int i = 0; i<5; i++) {
			System.out.print(i+",");
		}

		System.out.println();
		int i = 0 ;
		
		// 언제 멈춰야 할지 알 때는 while문 사용 
		while(i<5) {
			System.out.print(i+",");
			i++;
		}
		System.out.println();
		
		
		
		System.out.println("-----------------------------");
	
		int z= 0 ;
		//무한 루프
		//이 구조가 가장 편하고 자주 사용한다..
		while(true) {
			System.out.println(z);
			if(z==5) {
				break;
			}
			z++;
		}
		
		int y= 0;
		for(; y <10 ;){
			System.out.println(y);
			y++;
		}
		
		
		
		
	}

}
