package com.exception;

public class Sample {
public void display()
{
	int a=10;
	int b=0;

	try
	{
	System.out.println(a/b);	
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println(a+b);
	}
}
	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.display();
		
}
		

	

}
