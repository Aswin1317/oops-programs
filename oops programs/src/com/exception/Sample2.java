package com.exception;

import javax.swing.plaf.synth.SynthStyleFactory;

public class Sample2 {
public void display()
{
	int a=10;
	int b=0;
	try
	{
		System.out.println(a+b);
		try
		{
			System.out.println(a/b);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}}
		catch(Exception f)
		{
			System.out.println(f);
		}
		
	
}
	static void main(String[] args) {
		// TODO Auto-generated method stub
Sample2 sample2=new Sample2();
sample2.display();
	}

}
