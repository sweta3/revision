package com.lab4com.revesion;
import java.util.*;

public class ExchangeApp {
	
	public static void main(String[] args) {
		
		//TODO: declare local variables
		int amount, rate, conv;
		
		//TODO: declare objects
		Exchange myExchange = new Exchange();
		Scanner sc = new Scanner(System.in);
		
		//TODO: input
		System.out.println("\tPlease enter amount to be converted: ");
		amount=sc.nextInt();
		
		//TODO: setMethod to put sc value
		myExchange.setAmount(amount);
		
		//TODO: input
		System.out.println("\tPlease enter rate to the conversion: ");
		rate=sc.nextInt();
		
		//TODO: setMethod
		myExchange.setRate(rate);
		
		//TODO: process 
		myExchange.compute();
		conv = myExchange.getConversion();
		
		//TODO: output
		System.out.println(+ amount + " at a rate off " + rate + " is " + conv);
		
	}//end main

}//end class
