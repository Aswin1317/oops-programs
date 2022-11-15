package com.encapsulation;

public class AddNumber {
private int a;
private int b;
private int c;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}

public void display()
{
	c=a+b;
	System.out.println("Addition of two number :"+c);
}
}
