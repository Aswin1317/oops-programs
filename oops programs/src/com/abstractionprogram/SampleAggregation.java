package com.abstractionprogram;

public class SampleAggregation {

	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Abc");
	}
public static void main(String[] args) {
	SampleAggregation sample=new SampleAggregation();
	sample.display();
	ExampleAggregation example=new ExampleAggregation();//abstract method cannot be instantiate 
	example.name();
}
}
