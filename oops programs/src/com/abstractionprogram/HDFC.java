package com.abstractionprogram;
import java.util.Scanner;
public class HDFC implements RBI{
	@Override
	public void recurringDeposit(float deposit,int month) {
		
		
		float total=((deposit*month)*intrest);
		System.out.println("Total amont :"+total);
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the deposit amount :");
float deposit=sc.nextInt();
System.out.println("Enter the duration time in month :");
int month=sc.nextInt();
	HDFC hdfc=new HDFC();
	hdfc.recurringDeposit(deposit,month);

}
}
