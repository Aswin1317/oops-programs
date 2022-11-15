package com.abstractionprogram;

public class Sample extends Example {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abc");
	}
public static void main(String[] args) {
	{
		Sample sample=new Sample();
		sample.display();
		sample.name();
	}
}
}
