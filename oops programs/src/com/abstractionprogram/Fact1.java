package com.abstractionprogram;
import java.util.Scanner;
public class Fact1 extends Fact{
int fact;
	@Override

	public void display(int facto) {
		// TODO Auto-generated method stub
		fact=1;
		for(int i=1;i<=facto;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fact1 fact1=new Fact1();
		System.out.print("Enter the number to find factorial :");
		int facto=sc.nextInt();
		fact1.display(facto);
		
	}
}
