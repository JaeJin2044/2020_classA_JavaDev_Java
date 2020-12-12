package com.koreait.first.card;


//모양 : shape(spade,heart,clover,diamond)
//번호value:(A,1,2,3,4,5,6,7,8,9,10,J,Q,K)
	
public class Card {
	private String shape; 
	private String value;
	
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}


	public String getValue() {
		return value;
	}




	public void setValue(String value) {
		this.value = value;
	}
	
	
	public Card(){
		
	}
	
	
	
	public Card(String shape, String value) {
		this.shape = shape;
		this.value = value;
	}
	



	@Override
	public String toString() {
		

		return this.shape+" ("+this.value+")";
	}
	
	
}
	
