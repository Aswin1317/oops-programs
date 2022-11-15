package com.abstractionprogram;
import java.util.Scanner;
public class Contractor extends Employee{

	@Override
	public void calculateSalary(int a) {
		// TODO Auto-generated method stub
		
		int total=a*1500;
		System.out.println("Total Salary :"+total);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Contractor contractor=new Contractor();
	System.out.println("a.Part Time Employee");
	System.out.println("b.Full Time Employee");
	System.out.print("Select your choice :");
	String ch=sc.nextLine();
	switch(ch)
	{
	case"a":
		System.out.print("Enter your work time :");
		int a=sc.nextInt();
		contractor.calculateSalary(a);
		break;
	case"b":
		final int b=8;
		contractor.calculateSalary(b);
		break;
		default:
			System.out.println("Invalid Input");
			
	}
	
}

	
}

