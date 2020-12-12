package com.koreait.first.obj;


// class앞에 public은 파일명과 같은 클래스에만 붙일 수 있다.
// 나머지는 붙일 수 없음.
public class ObjTest5 {
	public static void main(String[] args) {
		//아래 NumberBox2를 객체화 하여 
		// a = 10 , b = 20 을 넣고
		// sum()메소드를 호출하여 리턴하는 값을 콘솔에 출력해주세요!!
		
  //NumberBox2타입   //객체 주소값 담음       	//객체 생성
		NumberBox2 nbx2 = new NumberBox2();
		nbx2.a = 10;
		nbx2.b = 20;
		System.out.println("a + b = "+nbx2.sum());
		
		NumberBox2 new_nbx2 = new NumberBox2();
		new_nbx2.a = 33 ;
		new_nbx2.b = 44 ;
		
		
		System.out.println("nbx2 : "+nbx2.sum());
		System.out.println("new_nbx2 : "+new_nbx2.sum());
		

	}

}


class NumberBox2{
	int a;
	int b;
	
	int sum() {
		return a+b;
	}
	
	
}
