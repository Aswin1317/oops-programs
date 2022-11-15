package com.abstractionprogram;

public class Display implements Fruit{

	@Override
	public void colors() {
		// TODO Auto-generated method stub
		System.out.println("Red");
		System.out.println("Black");
		System.out.println("Blue");
	}

	@Override
	public void fruit() {
		// TODO Auto-generated method stub
		System.out.println("Mango");
		System.out.println("Orange");
		System.out.println("Apple");
	}
public static void main(String[] args) {
	Display display=new Display();
	display.colors();
	display.fruit();
}
}
