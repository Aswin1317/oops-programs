package homework;

public class Banktransaction {
public void withdrawal(int total,int withdraw)
{
	if(total>withdraw)
	{
		total=total-withdraw;
		System.out.println("Available balance after withdraw :"+total);
	}
	else
	{
		System.out.println("Insufficient balnce "+" "+"Your available balance is :");
	}
}
public void deposit(int total,int deposit)
{
	total=total+deposit;
	System.out.println("Available balance after Deposit amount :"+total);
}
public void total(int total)
{
	System.out.println("Total balance :"+total);
}
}
