package com.koreait.first.loop;


public class For7 {

	public static void main(String[] args) {
		
		// case 1
		int star = 10 ;
		String str = " ";
		for (int i = 0; i < star; i++) {
	
			for(int z = star; z > i;z--) {
				System.out.printf(str);	
			}
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");	
			}
			System.out.println();
		}
		
		
		System.out.println("------------");
		
		// case2
		for(int i = star; i > 0; i--) {
			for(int z =1 ; z<=star; z++) {
				if(i > z ) {
					System.out.print("_");
					
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
