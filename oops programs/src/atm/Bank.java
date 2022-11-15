package atm;

public class Bank {
private int a=1001;
private int b=1234;
private int c=1212;

public void display(int pin)
{
	if((a==pin) || (b==pin)||(c==pin))
	{
		System.out.println("Withdrawel is possible");
	}
	else
	{
		System.out.println("Incorrect pin Withdrawel is not possible");
	}
	
}

}
