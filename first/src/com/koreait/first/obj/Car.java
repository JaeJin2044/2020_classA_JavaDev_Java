package com.koreait.first.obj;

public class Car {
	
	//멤버  필드 (저장 담당) 대체로 명사로 네이밍함. 
	String name;
	int cc;
	String color;
	
	//멤버 메소드 (움직임이 있는 것 담당) 대체로 동사 이름으로 네이밍함.
	public void drive() {
		System.out.printf("%s색상의 %dcc의 %s 차량이 달린다.\n",color,cc,name);
	}

}
