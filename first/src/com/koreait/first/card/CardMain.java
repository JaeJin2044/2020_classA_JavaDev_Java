package com.koreait.first.card;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

import com.koreait.first.array.Array;

public class CardMain {

	public static void main(String[] args) {
		Card c1 = new Card("spade","2");
		Card c2 = new Card("spade","7");
		
		//c1을 보내주든 , c1.toString() ==> 똑같다.
		
		System.out.println(c1);
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("=======================");
		
		//52개의 카드 객체를 담을수 있는 배열 생성
		//52개의 서로다른 값을 가지고 있는 카드 객체를 모두 
		//담아주세요
		
		MakeCard card52 = new MakeCard();
		System.out.println(card52.cArr[14].getShape());
		System.out.println(Arrays.toString(card52.cArr));
	
		
	
		
		
		
		
		
		
		
		
	}

}
