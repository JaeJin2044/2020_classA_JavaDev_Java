package com.koreait.first.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DbUtils {
	public static void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
										//니가 해결해줘 !!! 미룬다.
										//언젠가 try catch 해줘야함
										//throws Exception
	public static Connection getCon() {
		// 자바와 데이터베이스 연결된 정보 ..  
		// 그 정보를 con이 가리킴.
		Connection con = null;
		
		//								// 포트번호		//데이터베이스 명
		final String URL = "jdbc:mysql://localhost:3306/test";
		final String USER = "root";
		final String PW = "koreait2020";
		
		//객체화 하지 않고 쓰는 메소드 ? => "스테틱 메소드"
		
		try {
		//자동으로 해줌 Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("접속 완료!!!");
		
		return con;
		
	}
}
