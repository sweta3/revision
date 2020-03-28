package com.lab4com.revesion;

public class BlueBox {

	public static void main(String[] args) {
		Box defaulBox = new Box();
		
		System.out.println(defaulBox.compute());
		
		Box smallBox = new Box(5, 5, 2);
		
		System.out.println(smallBox.compute());

	}

}
