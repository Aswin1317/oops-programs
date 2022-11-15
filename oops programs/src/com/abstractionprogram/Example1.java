package com.abstractionprogram;

public class Example1 implements Sample1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hii");
	}
public static void main(String[] args) {
	Example1 example1=new Example1();
	example1.display();
}
}
