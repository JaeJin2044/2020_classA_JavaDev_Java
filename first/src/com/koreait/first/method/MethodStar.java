package com.koreait.first.method;

public class MethodStar {

	public static void main(String[] args) {
		
		printStarReverseTri(6);

	}
	
	public static void printStarReverseTri(int star) {
		
		for(int j = star; j > 0; j--) {
			int star1;
			
			//여기가 핵심 !! 변수 잘 주기 ..
			int empty = j-1; //5
			star1 = star-empty ;//1

			printShape(empty," ");
			printStar(star1);
			System.out.println();
			
		}
		
		
	}

	public static void printShape(int star,String shape) {
		for (int i = 0; i < star ; i++) {
			System.out.print(shape);
		}

	}
	

	public static void printStar(int star) {
		for (int i = 1; i <= star; i++) {
			System.out.print("*");
		}
		
		
	}
	
	
	
	
	
	
	
	
//	public static void printStarSquare(int star) {
//		for(int i = 0; i <star; i++) {
//			printStar(star);
//			
//			
//		}
//		
//	}
//	
//	public static void printStarTri(int star) {
//		for(int i = 0; i <star; i++) {
//			printStar(i+1);
//			
//			
//		}
//	}

}

	
