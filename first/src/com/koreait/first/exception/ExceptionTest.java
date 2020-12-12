package com.koreait.first.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		//DBMS(MySQL, Oracle, MS-Sql, MariaDB, MongoDB....)
		//DataBase Management System
		//R-DBMS Relationship(관계형 DBMS)(MS-SQL , Oracle, Mysql)
		
		
		
		// 12-11 Class Memo
		// MariaDB접속
		// 자바랑 db랑 플랫폼이 달라서 연결하는 장치가 필요함...   what? ==> 드라이버 
		// jdbc(드라이버) 구글 검색 => jdbc mysql drive  (https://dev.mysql.com/downloads/connector/j/)
		// platform independent(선택) =>  두번쨰 꺼 아카이브 클릭 => No thanks, just start my download.
		// 압축풀고 jar파일을 프로젝트에 임폴트해야함 .
		// 프로젝트명 => 빌드 패스 => add jar.
		
		
		
		int n1 = 10;
		int n2 = 0;
		
		try {
			System.out.println(n1 / n2);
			System.out.println("에러안났음!!!"); //이부분 실행 안됨 ..  위에서 에러 뜨자마자 바로 catch로 감 
		}catch(Exception e) {//에러가 발생하지 않으면 catch 문은 실행 되지 않는다 .
			e.printStackTrace();  // 에러가 어떤 이유로 뜨는지 보유주는 문장
			System.out.println("에러 발생 ");
		}finally {  //예외가 터지든 안터지든 무조건 실행 된다.
			System.out.println("Finally!!!!");
		}
		
		
		System.out.println("안녕하세요 !!");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
