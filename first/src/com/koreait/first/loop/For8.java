package com.koreait.first.loop;


public class For8 {

	public static void main(String[] args) {
		// 구구단 2~9단   
		
		for (int i = 2; i <= 9 ; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d X %d = %d\t",i,j,(i*j));
			}
			if (i == 9) {
				continue;
			}
			System.out.println();
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
