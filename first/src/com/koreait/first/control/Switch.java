package com.koreait.first.control;

public class Switch {

	public static void main(String[] args) {
		//
		
		
		
		int num = 4;
		
		//switch 문은 break만나기 전까지 모든 것을 실행한다.
		switch(num) {
			case 1:
				System.out.println("1입니다");
				break;
			case 2:
				System.out.println("2입니다");
				break;
			case 3:
				System.out.println("3입니다");
				break;
			case 4:
				System.out.println("4입니다");
				break;
			case 5:
				System.out.println("5입니다");
				break;
			default:
				System.out.println("1~5아닙니다.");	
			
		}
		System.out.println("-------------------------------");
		
		// switch문은 문자열과 궁합이 좋다 .
		String season = "겨울";
		switch(season) {
			case "봄":
				System.out.println("꽃이 피었습니다");
				break;
			case "여름":
				System.out.println("물놀이 가요 ");
				break;
			case "가을":
				System.out.println("단풍구경 가요 ");
				break;
			case "겨울":
				System.out.println("눈싸움 해요 ~~~");
				break;
			default:
				System.out.println("존재하지 않는 계절이요!!");
		}
		
	}

}








