package com.koreait.first.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		//두개 차이 인지..(finally는 무조건 뜸..) try ,catch 는 필수이고 , finally는 선택 
		//오류가 뜨면 try 문에서 return을 만나기 때문에 종료!! 가 뜨지 않는다.
		//오류가 뜨지 않으면 종료 까지 다 뜬다...
		div(10,0);
	//	div(10,2);
		

	}
	
	public static int div(int n1, int n2) {
		try {
			System.out.println("hi");
			return n1 / n2;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("완료 !!!!! ");
		}
		System.out.println("종료 !!!!!");
		return 0 ;
		
	}

}
