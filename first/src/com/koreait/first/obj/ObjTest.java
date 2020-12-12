package com.koreait.first.obj;


//자바 파일명과 같은 클래스에만 public 붙일 수 있다.
public class ObjTest {

	public static void main(String[] args) {
		
		int mNum = 10;
		
		NumberBox nbx = new NumberBox();
		nbx.num = 10 ;
		
		changeVal(mNum);
		changeVal(nbx);
		System.out.println("mNum = "+mNum);
		
		
		// 값이 10으로 나온다 ... because changeVal(NumberBox pNbx) 메소드에서 새로운 객체를 생성하여 ...  주소값이 변경되었기 때문에 
		// 밑에서 값을 변경한다 하더라도 원래의 값에 영향을 주지 않는다.
		System.out.println("nbx.num = "+nbx.num);
		
	}
	
	public static void changeVal(int mNum) {
		mNum = 20 ;
		mNum = 30 ; 
		mNum = 40 ;
	}
	
	public static void changeVal(NumberBox pNbx) {
		//이렇게 객체를 새로 생성했기때문에 주소값이 달라 졌다 ..
		// 밑에서 아무리 값을 바꿔도 파라미터 값으로 받아온 pNbx에 영향을 미치지 않는다.
		pNbx = new NumberBox();
		pNbx.num = 40 ;
	}
	
	

}


class NumberBox{
	int num;
}








