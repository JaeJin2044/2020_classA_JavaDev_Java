package com.koreait.first.exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		//Exception은 최상위 클래스이다 . 
		
		
		
		try {
			div(10,0);
		}catch (ArithmeticException e) {
			System.out.println("수학적인 에러가 발생 ");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수가 없습니다.");
		}catch (Exception e) {	//Exception 은제일 밑에 있어야함.. 위에 있을 시 다잡아 주기 때문
			
			e.printStackTrace();
		}
		System.out.println("안녕");
		
	}
												//이게 달려 있으면 에러가 터지든 안터지든 호출하는 곳을 try ~ catch로 감싸 줘야함.
	public static void div(int n1, int n2) throws Exception {
		System.out.println(n1 / n2);
	}

	
//이런식으로 사용 가능 .. 이때는 이렇게 처리 이때는 이렇게 처리 , 로 계속 적을 수 있음 .
//	public static void div(int n1, int n2) throws ArithmeticException, ClassCastException {
//		System.out.println(n1 / n2);
//	}

}
