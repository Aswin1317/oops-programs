package com.encapsulation;

public class Result extends AddNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result result=new Result();
result.setA(10);
System.out.println("First number :"+result.getA());
result.setB(20);
System.out.println("Second number :"+result.getB());
result.display();
	}

}
