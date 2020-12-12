package com.koreait.first.obj2;

public class ClassA {
	private String name;
	
	public ClassA() {
		System.out.println("ClassA 생성자");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


class ClassB extends ClassA{
	
	private int age;
	
	public ClassB() {
		super();
		System.out.println("ClassB 생성자");
	}

	public  int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class ClassC extends ClassB{
	
	public ClassC() {
		super();
		System.out.println("ClassC 생성자");
	}
	
	public ClassC(String name , int age) {
		setName(name);
		setAge(age);
		
	}
	
	public void print() {
		System.out.printf("저는 %s이고, 나이는 %d살입니다.\n",getName(),getAge());
	}
	
}

class ClassD extends ClassC{
	public ClassD() {
		//상속 받은 부모클래스의 생성자와 동일한 형식의 생성자를 호출해야함..
		super("이순신",27);
	}
	
	public ClassD(String name ,int age){
		super(name,age);
	}
	@Override //  @(애노테이션)
	public void print() {
		System.out.printf("I'm %s, My age is %d\n",getName(),getAge());
	}
	
	
	
	
	
	
}





