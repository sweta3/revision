package com.lab4com.revesion;

public class Exchange {

	//declare data members - amount-summa, rate-likme, conversion
	private int amount;
	private int rate;
	private int conversion;
	
	
	//constructor
	public Exchange() {
		
	}

	//constructor - amount, rate
	public Exchange(int amount, int rate) {
		this.amount = amount;
		this.rate=rate;
	}
	
	//set methods
	public void setAmount(int amount) {
		this.amount=amount;
	}
	
	public void setRate(int rate) {
		this.rate=rate;
	}
	
	//calculation = conversion
	public void compute() {
		conversion = amount*rate;
	}
	
	//get result return conversion
	public int getConversion() {
		return conversion;
	}
		
}
