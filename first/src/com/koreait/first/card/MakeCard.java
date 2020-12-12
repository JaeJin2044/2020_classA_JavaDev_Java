package com.koreait.first.card;

public class MakeCard {
	//모양 : shape(spade,heart,clover,diamond)
	//번호value:(A,1,2,3,4,5,6,7,8,9,10,J,Q,K)
	public Card[] cArr = new Card[52];
	
	private String[] sArr = {"spade","heart","clover","diamond"};
	private String[] vArr = {"A","2","3","4","5,","6","7","8","9","10","J","Q","K"};
	
	
	
	public MakeCard() {
		int num =0;	
		for (int i = 0; i < sArr.length; i++) {
			
			for (int j = 0; j < vArr.length; j++) {
				cArr[num] = new Card(sArr[i],vArr[j]);
				num++;
			}
			
	}
	}

	public Card[] getcArr() {
		return cArr;
	}
	
	
}
