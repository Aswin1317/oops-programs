package com.exception;

public class Sample1 {
public void display()
{
	int a=10;
	int b=0;
	try
	{
		System.out.println(a/b);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(StringIndexOutOfBoundsException f)
	{
		System.out.println(f);
	}
	catch(NullPointerException g)
	{
		System.out.println(g);
	}
	catch(ArithmeticException h)
	{
		System.out.println(h);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample1 sample1=new Sample1();
sample1.display();
	}

}
