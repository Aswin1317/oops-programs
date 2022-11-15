package bank;
import java.util.Scanner;
public class Totalbalance {
	int total;
	public void bank(int withdraw)
	{
		if(total>withdraw) 
		{
		total=total-withdraw;
		System.out.println("Withdrawal amount is "+total);
		}
		else
		{
		System.out.println("Insufficient balance");	
		}
	}
	public void name(float deposit)
	{
	
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Deposit deposit=new Deposit();
}
}
