package com.exception;

public class DrivingLicense {
public void display()
{
	int age=18;
	
	
		if(age>=18)
		{
			System.out.println("Eligible for license");
		}
		else
		{
			throw new  ArithmeticException("Not eligible for license");
		}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DrivingLicense drivinglicense=new DrivingLicense();
drivinglicense.display();
	}

}
