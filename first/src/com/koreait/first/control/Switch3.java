package com.koreait.first.control;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 월을 입력 하세요 :

		
		// switch문은 대체로 문자열로 입력 받자 !!!
		System.out.printf("월을 입력하세요:");
		String month = sc.next();

		switch (month) {
			case "3": case "4": case "5":
				System.out.println("봄");
				break;
			case "6":
			case "7":
			case "8":
				System.out.println("여름");
				break;
			case "9":
			case "10":
			case "11":
				System.out.println("가을");
				break;
			case "12":
			case "1":
			case "2":
				System.out.println("겨울");
				break;
			default:
				System.out.println("잘못입력 했으니 다시입력바람");
				break;
			}
		sc.close();

	}

}
